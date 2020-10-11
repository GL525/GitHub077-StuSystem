package com.kgc.zjh.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.zjh.mapper.StandardMapper;
import com.kgc.zjh.pojo.Standard;
import com.kgc.zjh.pojo.StandardExample;
import com.kgc.zjh.service.StandardService;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class StandardController {

    @Resource
    StandardMapper standardMapper;

    @Resource
    StandardService standardService;

    @RequestMapping("/Index")
    public String toIndex(Model model,String name,String pageIndex){
        int pageNum=1;
        if (pageIndex!=null) {
            pageNum=Integer.parseInt(pageIndex);
        }
        int pageSize=3;
        PageHelper.startPage(pageNum,pageSize);
        List<Standard> standards = standardService.selectAll(name);
        PageInfo pageInfo=new PageInfo(standards);
        model.addAttribute("pageInfo",pageInfo);
        return "index";
    }

    @RequestMapping("/doname")
    @ResponseBody
    public Map doname(String stdNum){
        Map<String,Object> map=new HashMap<>();
        List<Standard> standards = standardMapper.selectByExample(null);
        for (int i = 0; i <standards.size(); i++) {
            if(standards.get(i).getStdNum().equals(stdNum)){
                map.put("status","true");
            }
        }
        return map;
    }

    @RequestMapping("/doadd")
    public String add(Standard standard, MultipartFile file, HttpSession session){
        String realPath = session.getServletContext().getRealPath("/static/images");
        String originalFilename = file.getOriginalFilename();
        String extension = FilenameUtils.getExtension(originalFilename);
        String FileName=System.currentTimeMillis()+ RandomUtils.nextInt(10000)+"_."+extension;
        File file1=new File(realPath,FileName);
        try {
            file.transferTo(file1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        standard.setPackagePath(FileName);
        standardService.insert(standard);
        return "redirect:/Index";
    }

    @RequestMapping("/down")
    @ResponseBody
    public void down(String filename, HttpServletRequest request, HttpServletResponse response){
        String realPath = request.getServletContext().getRealPath("static/images");
        File file=new File(realPath,filename);
        //设置响应类型  ==》 告诉浏览器当前是下载操作，我要下载东西
        response.setContentType("application/x-msdownload");
        //设置下载时文件的显示类型(即文件名称-后缀)   ex：txt为文本类型
        response.setHeader("Content-Disposition", "attachment;filename=" + filename);
        //下载文件：将一个路径下的文件数据转到一个输出流中，也就是把服务器文件通过流写(复制)到浏览器端
        try {
            Files.copy(file.toPath(), response.getOutputStream());//Files.copy(要下载的文件的路径,响应的输出流)
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/delete")
    public String delete(String id,HttpSession session){
        System.out.println(id);
        List list=new ArrayList();
        String[] split = id.split(",");//分割，
        for (int i = 0; i < split.length; i++) {
            int num=Integer.parseInt(split[i]);//转换为int类型
            list.add(num);//存入集合中
        }
        int delete=standardService.delete(list);
        if(delete>0){
            session.setAttribute("flag","1");
        }
        return "redirect:/Index";
    }

    @RequestMapping("/updCha")
    public String updCha(int id,Model model){
        Standard standard = standardService.selectById(id);
        model.addAttribute("list",standard);
        return "update";
    }

    @RequestMapping("/doupdate")
    public String update(MultipartFile file,Standard standard,HttpSession session){
        String realPath = session.getServletContext().getRealPath("/static/images");
        String originalFilename = file.getOriginalFilename();
        String extension = FilenameUtils.getExtension(originalFilename);
        String FileName=System.currentTimeMillis()+ RandomUtils.nextInt(10000)+"_."+extension;
        File file1=new File(realPath,FileName);

        try {
            file.transferTo(file1);
        } catch (IOException e) {
            e.printStackTrace();
        }

        standard.setPackagePath(FileName);
        standardService.update(standard);
        return "redirect:/Index";
    }
}
