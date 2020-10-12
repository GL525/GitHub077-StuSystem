package com.kgc.zjh.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StandardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StandardExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStdNumIsNull() {
            addCriterion("std_num is null");
            return (Criteria) this;
        }

        public Criteria andStdNumIsNotNull() {
            addCriterion("std_num is not null");
            return (Criteria) this;
        }

        public Criteria andStdNumEqualTo(String value) {
            addCriterion("std_num =", value, "stdNum");
            return (Criteria) this;
        }

        public Criteria andStdNumNotEqualTo(String value) {
            addCriterion("std_num <>", value, "stdNum");
            return (Criteria) this;
        }

        public Criteria andStdNumGreaterThan(String value) {
            addCriterion("std_num >", value, "stdNum");
            return (Criteria) this;
        }

        public Criteria andStdNumGreaterThanOrEqualTo(String value) {
            addCriterion("std_num >=", value, "stdNum");
            return (Criteria) this;
        }

        public Criteria andStdNumLessThan(String value) {
            addCriterion("std_num <", value, "stdNum");
            return (Criteria) this;
        }

        public Criteria andStdNumLessThanOrEqualTo(String value) {
            addCriterion("std_num <=", value, "stdNum");
            return (Criteria) this;
        }

        public Criteria andStdNumLike(String value) {
            addCriterion("std_num like", value, "stdNum");
            return (Criteria) this;
        }

        public Criteria andStdNumNotLike(String value) {
            addCriterion("std_num not like", value, "stdNum");
            return (Criteria) this;
        }

        public Criteria andStdNumIn(List<String> values) {
            addCriterion("std_num in", values, "stdNum");
            return (Criteria) this;
        }

        public Criteria andStdNumNotIn(List<String> values) {
            addCriterion("std_num not in", values, "stdNum");
            return (Criteria) this;
        }

        public Criteria andStdNumBetween(String value1, String value2) {
            addCriterion("std_num between", value1, value2, "stdNum");
            return (Criteria) this;
        }

        public Criteria andStdNumNotBetween(String value1, String value2) {
            addCriterion("std_num not between", value1, value2, "stdNum");
            return (Criteria) this;
        }

        public Criteria andZhnameIsNull() {
            addCriterion("zhname is null");
            return (Criteria) this;
        }

        public Criteria andZhnameIsNotNull() {
            addCriterion("zhname is not null");
            return (Criteria) this;
        }

        public Criteria andZhnameEqualTo(String value) {
            addCriterion("zhname =", value, "zhname");
            return (Criteria) this;
        }

        public Criteria andZhnameNotEqualTo(String value) {
            addCriterion("zhname <>", value, "zhname");
            return (Criteria) this;
        }

        public Criteria andZhnameGreaterThan(String value) {
            addCriterion("zhname >", value, "zhname");
            return (Criteria) this;
        }

        public Criteria andZhnameGreaterThanOrEqualTo(String value) {
            addCriterion("zhname >=", value, "zhname");
            return (Criteria) this;
        }

        public Criteria andZhnameLessThan(String value) {
            addCriterion("zhname <", value, "zhname");
            return (Criteria) this;
        }

        public Criteria andZhnameLessThanOrEqualTo(String value) {
            addCriterion("zhname <=", value, "zhname");
            return (Criteria) this;
        }

        public Criteria andZhnameLike(String value) {
            addCriterion("zhname like", value, "zhname");
            return (Criteria) this;
        }

        public Criteria andZhnameNotLike(String value) {
            addCriterion("zhname not like", value, "zhname");
            return (Criteria) this;
        }

        public Criteria andZhnameIn(List<String> values) {
            addCriterion("zhname in", values, "zhname");
            return (Criteria) this;
        }

        public Criteria andZhnameNotIn(List<String> values) {
            addCriterion("zhname not in", values, "zhname");
            return (Criteria) this;
        }

        public Criteria andZhnameBetween(String value1, String value2) {
            addCriterion("zhname between", value1, value2, "zhname");
            return (Criteria) this;
        }

        public Criteria andZhnameNotBetween(String value1, String value2) {
            addCriterion("zhname not between", value1, value2, "zhname");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("version like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("version not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andKeyssIsNull() {
            addCriterion("keyss is null");
            return (Criteria) this;
        }

        public Criteria andKeyssIsNotNull() {
            addCriterion("keyss is not null");
            return (Criteria) this;
        }

        public Criteria andKeyssEqualTo(String value) {
            addCriterion("keyss =", value, "keyss");
            return (Criteria) this;
        }

        public Criteria andKeyssNotEqualTo(String value) {
            addCriterion("keyss <>", value, "keyss");
            return (Criteria) this;
        }

        public Criteria andKeyssGreaterThan(String value) {
            addCriterion("keyss >", value, "keyss");
            return (Criteria) this;
        }

        public Criteria andKeyssGreaterThanOrEqualTo(String value) {
            addCriterion("keyss >=", value, "keyss");
            return (Criteria) this;
        }

        public Criteria andKeyssLessThan(String value) {
            addCriterion("keyss <", value, "keyss");
            return (Criteria) this;
        }

        public Criteria andKeyssLessThanOrEqualTo(String value) {
            addCriterion("keyss <=", value, "keyss");
            return (Criteria) this;
        }

        public Criteria andKeyssLike(String value) {
            addCriterion("keyss like", value, "keyss");
            return (Criteria) this;
        }

        public Criteria andKeyssNotLike(String value) {
            addCriterion("keyss not like", value, "keyss");
            return (Criteria) this;
        }

        public Criteria andKeyssIn(List<String> values) {
            addCriterion("keyss in", values, "keyss");
            return (Criteria) this;
        }

        public Criteria andKeyssNotIn(List<String> values) {
            addCriterion("keyss not in", values, "keyss");
            return (Criteria) this;
        }

        public Criteria andKeyssBetween(String value1, String value2) {
            addCriterion("keyss between", value1, value2, "keyss");
            return (Criteria) this;
        }

        public Criteria andKeyssNotBetween(String value1, String value2) {
            addCriterion("keyss not between", value1, value2, "keyss");
            return (Criteria) this;
        }

        public Criteria andReleaseDateIsNull() {
            addCriterion("release_date is null");
            return (Criteria) this;
        }

        public Criteria andReleaseDateIsNotNull() {
            addCriterion("release_date is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseDateEqualTo(Date value) {
            addCriterionForJDBCDate("release_date =", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("release_date <>", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateGreaterThan(Date value) {
            addCriterionForJDBCDate("release_date >", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("release_date >=", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateLessThan(Date value) {
            addCriterionForJDBCDate("release_date <", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("release_date <=", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateIn(List<Date> values) {
            addCriterionForJDBCDate("release_date in", values, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("release_date not in", values, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("release_date between", value1, value2, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("release_date not between", value1, value2, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andImplDateIsNull() {
            addCriterion("impl_date is null");
            return (Criteria) this;
        }

        public Criteria andImplDateIsNotNull() {
            addCriterion("impl_date is not null");
            return (Criteria) this;
        }

        public Criteria andImplDateEqualTo(Date value) {
            addCriterionForJDBCDate("impl_date =", value, "implDate");
            return (Criteria) this;
        }

        public Criteria andImplDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("impl_date <>", value, "implDate");
            return (Criteria) this;
        }

        public Criteria andImplDateGreaterThan(Date value) {
            addCriterionForJDBCDate("impl_date >", value, "implDate");
            return (Criteria) this;
        }

        public Criteria andImplDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("impl_date >=", value, "implDate");
            return (Criteria) this;
        }

        public Criteria andImplDateLessThan(Date value) {
            addCriterionForJDBCDate("impl_date <", value, "implDate");
            return (Criteria) this;
        }

        public Criteria andImplDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("impl_date <=", value, "implDate");
            return (Criteria) this;
        }

        public Criteria andImplDateIn(List<Date> values) {
            addCriterionForJDBCDate("impl_date in", values, "implDate");
            return (Criteria) this;
        }

        public Criteria andImplDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("impl_date not in", values, "implDate");
            return (Criteria) this;
        }

        public Criteria andImplDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("impl_date between", value1, value2, "implDate");
            return (Criteria) this;
        }

        public Criteria andImplDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("impl_date not between", value1, value2, "implDate");
            return (Criteria) this;
        }

        public Criteria andPackagePathIsNull() {
            addCriterion("package_path is null");
            return (Criteria) this;
        }

        public Criteria andPackagePathIsNotNull() {
            addCriterion("package_path is not null");
            return (Criteria) this;
        }

        public Criteria andPackagePathEqualTo(String value) {
            addCriterion("package_path =", value, "packagePath");
            return (Criteria) this;
        }

        public Criteria andPackagePathNotEqualTo(String value) {
            addCriterion("package_path <>", value, "packagePath");
            return (Criteria) this;
        }

        public Criteria andPackagePathGreaterThan(String value) {
            addCriterion("package_path >", value, "packagePath");
            return (Criteria) this;
        }

        public Criteria andPackagePathGreaterThanOrEqualTo(String value) {
            addCriterion("package_path >=", value, "packagePath");
            return (Criteria) this;
        }

        public Criteria andPackagePathLessThan(String value) {
            addCriterion("package_path <", value, "packagePath");
            return (Criteria) this;
        }

        public Criteria andPackagePathLessThanOrEqualTo(String value) {
            addCriterion("package_path <=", value, "packagePath");
            return (Criteria) this;
        }

        public Criteria andPackagePathLike(String value) {
            addCriterion("package_path like", value, "packagePath");
            return (Criteria) this;
        }

        public Criteria andPackagePathNotLike(String value) {
            addCriterion("package_path not like", value, "packagePath");
            return (Criteria) this;
        }

        public Criteria andPackagePathIn(List<String> values) {
            addCriterion("package_path in", values, "packagePath");
            return (Criteria) this;
        }

        public Criteria andPackagePathNotIn(List<String> values) {
            addCriterion("package_path not in", values, "packagePath");
            return (Criteria) this;
        }

        public Criteria andPackagePathBetween(String value1, String value2) {
            addCriterion("package_path between", value1, value2, "packagePath");
            return (Criteria) this;
        }

        public Criteria andPackagePathNotBetween(String value1, String value2) {
            addCriterion("package_path not between", value1, value2, "packagePath");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}