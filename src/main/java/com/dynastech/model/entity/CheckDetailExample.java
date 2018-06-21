package com.dynastech.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CheckDetailExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table T_Apply_CheckDetail
	 * @mbggenerated  Tue Sep 26 14:13:16 CST 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table T_Apply_CheckDetail
	 * @mbggenerated  Tue Sep 26 14:13:16 CST 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table T_Apply_CheckDetail
	 * @mbggenerated  Tue Sep 26 14:13:16 CST 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_Apply_CheckDetail
	 * @mbggenerated  Tue Sep 26 14:13:16 CST 2017
	 */
	public CheckDetailExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_Apply_CheckDetail
	 * @mbggenerated  Tue Sep 26 14:13:16 CST 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_Apply_CheckDetail
	 * @mbggenerated  Tue Sep 26 14:13:16 CST 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_Apply_CheckDetail
	 * @mbggenerated  Tue Sep 26 14:13:16 CST 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_Apply_CheckDetail
	 * @mbggenerated  Tue Sep 26 14:13:16 CST 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_Apply_CheckDetail
	 * @mbggenerated  Tue Sep 26 14:13:16 CST 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_Apply_CheckDetail
	 * @mbggenerated  Tue Sep 26 14:13:16 CST 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_Apply_CheckDetail
	 * @mbggenerated  Tue Sep 26 14:13:16 CST 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_Apply_CheckDetail
	 * @mbggenerated  Tue Sep 26 14:13:16 CST 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_Apply_CheckDetail
	 * @mbggenerated  Tue Sep 26 14:13:16 CST 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_Apply_CheckDetail
	 * @mbggenerated  Tue Sep 26 14:13:16 CST 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table T_Apply_CheckDetail
	 * @mbggenerated  Tue Sep 26 14:13:16 CST 2017
	 */
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

		public Criteria andIdIsNull() {
			addCriterion("acd.id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("acd.id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(String value) {
			addCriterion("acd.id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(String value) {
			addCriterion("acd.id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(String value) {
			addCriterion("acd.id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(String value) {
			addCriterion("acd.id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(String value) {
			addCriterion("acd.id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(String value) {
			addCriterion("acd.id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLike(String value) {
			addCriterion("acd.id like", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotLike(String value) {
			addCriterion("acd.id not like", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<String> values) {
			addCriterion("acd.id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<String> values) {
			addCriterion("acd.id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(String value1, String value2) {
			addCriterion("acd.id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(String value1, String value2) {
			addCriterion("acd.id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andApplyidIsNull() {
			addCriterion("acd.applyId is null");
			return (Criteria) this;
		}

		public Criteria andApplyidIsNotNull() {
			addCriterion("acd.applyId is not null");
			return (Criteria) this;
		}

		public Criteria andApplyidEqualTo(String value) {
			addCriterion("acd.applyId =", value, "applyid");
			return (Criteria) this;
		}

		public Criteria andApplyidNotEqualTo(String value) {
			addCriterion("acd.applyId <>", value, "applyid");
			return (Criteria) this;
		}

		public Criteria andApplyidGreaterThan(String value) {
			addCriterion("acd.applyId >", value, "applyid");
			return (Criteria) this;
		}

		public Criteria andApplyidGreaterThanOrEqualTo(String value) {
			addCriterion("acd.applyId >=", value, "applyid");
			return (Criteria) this;
		}

		public Criteria andApplyidLessThan(String value) {
			addCriterion("acd.applyId <", value, "applyid");
			return (Criteria) this;
		}

		public Criteria andApplyidLessThanOrEqualTo(String value) {
			addCriterion("acd.applyId <=", value, "applyid");
			return (Criteria) this;
		}

		public Criteria andApplyidLike(String value) {
			addCriterion("acd.applyId like", value, "applyid");
			return (Criteria) this;
		}

		public Criteria andApplyidNotLike(String value) {
			addCriterion("acd.applyId not like", value, "applyid");
			return (Criteria) this;
		}

		public Criteria andApplyidIn(List<String> values) {
			addCriterion("acd.applyId in", values, "applyid");
			return (Criteria) this;
		}

		public Criteria andApplyidNotIn(List<String> values) {
			addCriterion("acd.applyId not in", values, "applyid");
			return (Criteria) this;
		}

		public Criteria andApplyidBetween(String value1, String value2) {
			addCriterion("acd.applyId between", value1, value2, "applyid");
			return (Criteria) this;
		}

		public Criteria andApplyidNotBetween(String value1, String value2) {
			addCriterion("acd.applyId not between", value1, value2, "applyid");
			return (Criteria) this;
		}

		public Criteria andNodenameIsNull() {
			addCriterion("acd.nodeName is null");
			return (Criteria) this;
		}

		public Criteria andNodenameIsNotNull() {
			addCriterion("acd.nodeName is not null");
			return (Criteria) this;
		}

		public Criteria andNodenameEqualTo(String value) {
			addCriterion("acd.nodeName =", value, "nodename");
			return (Criteria) this;
		}

		public Criteria andNodenameNotEqualTo(String value) {
			addCriterion("acd.nodeName <>", value, "nodename");
			return (Criteria) this;
		}

		public Criteria andNodenameGreaterThan(String value) {
			addCriterion("acd.nodeName >", value, "nodename");
			return (Criteria) this;
		}

		public Criteria andNodenameGreaterThanOrEqualTo(String value) {
			addCriterion("acd.nodeName >=", value, "nodename");
			return (Criteria) this;
		}

		public Criteria andNodenameLessThan(String value) {
			addCriterion("acd.nodeName <", value, "nodename");
			return (Criteria) this;
		}

		public Criteria andNodenameLessThanOrEqualTo(String value) {
			addCriterion("acd.nodeName <=", value, "nodename");
			return (Criteria) this;
		}

		public Criteria andNodenameLike(String value) {
			addCriterion("acd.nodeName like", value, "nodename");
			return (Criteria) this;
		}

		public Criteria andNodenameNotLike(String value) {
			addCriterion("acd.nodeName not like", value, "nodename");
			return (Criteria) this;
		}

		public Criteria andNodenameIn(List<String> values) {
			addCriterion("acd.nodeName in", values, "nodename");
			return (Criteria) this;
		}

		public Criteria andNodenameNotIn(List<String> values) {
			addCriterion("acd.nodeName not in", values, "nodename");
			return (Criteria) this;
		}

		public Criteria andNodenameBetween(String value1, String value2) {
			addCriterion("acd.nodeName between", value1, value2, "nodename");
			return (Criteria) this;
		}

		public Criteria andNodenameNotBetween(String value1, String value2) {
			addCriterion("acd.nodeName not between", value1, value2, "nodename");
			return (Criteria) this;
		}

		public Criteria andResultIsNull() {
			addCriterion("acd.result is null");
			return (Criteria) this;
		}

		public Criteria andResultIsNotNull() {
			addCriterion("acd.result is not null");
			return (Criteria) this;
		}

		public Criteria andResultEqualTo(Boolean value) {
			addCriterion("acd.result =", value, "result");
			return (Criteria) this;
		}

		public Criteria andResultNotEqualTo(Boolean value) {
			addCriterion("acd.result <>", value, "result");
			return (Criteria) this;
		}

		public Criteria andResultGreaterThan(Boolean value) {
			addCriterion("acd.result >", value, "result");
			return (Criteria) this;
		}

		public Criteria andResultGreaterThanOrEqualTo(Boolean value) {
			addCriterion("acd.result >=", value, "result");
			return (Criteria) this;
		}

		public Criteria andResultLessThan(Boolean value) {
			addCriterion("acd.result <", value, "result");
			return (Criteria) this;
		}

		public Criteria andResultLessThanOrEqualTo(Boolean value) {
			addCriterion("acd.result <=", value, "result");
			return (Criteria) this;
		}

		public Criteria andResultIn(List<Boolean> values) {
			addCriterion("acd.result in", values, "result");
			return (Criteria) this;
		}

		public Criteria andResultNotIn(List<Boolean> values) {
			addCriterion("acd.result not in", values, "result");
			return (Criteria) this;
		}

		public Criteria andResultBetween(Boolean value1, Boolean value2) {
			addCriterion("acd.result between", value1, value2, "result");
			return (Criteria) this;
		}

		public Criteria andResultNotBetween(Boolean value1, Boolean value2) {
			addCriterion("acd.result not between", value1, value2, "result");
			return (Criteria) this;
		}

		public Criteria andOpinionIsNull() {
			addCriterion("acd.opinion is null");
			return (Criteria) this;
		}

		public Criteria andOpinionIsNotNull() {
			addCriterion("acd.opinion is not null");
			return (Criteria) this;
		}

		public Criteria andOpinionEqualTo(String value) {
			addCriterion("acd.opinion =", value, "opinion");
			return (Criteria) this;
		}

		public Criteria andOpinionNotEqualTo(String value) {
			addCriterion("acd.opinion <>", value, "opinion");
			return (Criteria) this;
		}

		public Criteria andOpinionGreaterThan(String value) {
			addCriterion("acd.opinion >", value, "opinion");
			return (Criteria) this;
		}

		public Criteria andOpinionGreaterThanOrEqualTo(String value) {
			addCriterion("acd.opinion >=", value, "opinion");
			return (Criteria) this;
		}

		public Criteria andOpinionLessThan(String value) {
			addCriterion("acd.opinion <", value, "opinion");
			return (Criteria) this;
		}

		public Criteria andOpinionLessThanOrEqualTo(String value) {
			addCriterion("acd.opinion <=", value, "opinion");
			return (Criteria) this;
		}

		public Criteria andOpinionLike(String value) {
			addCriterion("acd.opinion like", value, "opinion");
			return (Criteria) this;
		}

		public Criteria andOpinionNotLike(String value) {
			addCriterion("acd.opinion not like", value, "opinion");
			return (Criteria) this;
		}

		public Criteria andOpinionIn(List<String> values) {
			addCriterion("acd.opinion in", values, "opinion");
			return (Criteria) this;
		}

		public Criteria andOpinionNotIn(List<String> values) {
			addCriterion("acd.opinion not in", values, "opinion");
			return (Criteria) this;
		}

		public Criteria andOpinionBetween(String value1, String value2) {
			addCriterion("acd.opinion between", value1, value2, "opinion");
			return (Criteria) this;
		}

		public Criteria andOpinionNotBetween(String value1, String value2) {
			addCriterion("acd.opinion not between", value1, value2, "opinion");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeIsNull() {
			addCriterion("acd.createdTime is null");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeIsNotNull() {
			addCriterion("acd.createdTime is not null");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeEqualTo(String value) {
			addCriterion("acd.createdTime =", value, "createdtime");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeNotEqualTo(String value) {
			addCriterion("acd.createdTime <>", value, "createdtime");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeGreaterThan(String value) {
			addCriterion("acd.createdTime >", value, "createdtime");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeGreaterThanOrEqualTo(String value) {
			addCriterion("acd.createdTime >=", value, "createdtime");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeLessThan(String value) {
			addCriterion("acd.createdTime <", value, "createdtime");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeLessThanOrEqualTo(String value) {
			addCriterion("acd.createdTime <=", value, "createdtime");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeLike(String value) {
			addCriterion("acd.createdTime like", value, "createdtime");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeNotLike(String value) {
			addCriterion("acd.createdTime not like", value, "createdtime");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeIn(List<String> values) {
			addCriterion("acd.createdTime in", values, "createdtime");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeNotIn(List<String> values) {
			addCriterion("acd.createdTime not in", values, "createdtime");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeBetween(String value1, String value2) {
			addCriterion("acd.createdTime between", value1, value2, "createdtime");
			return (Criteria) this;
		}

		public Criteria andCreatedtimeNotBetween(String value1, String value2) {
			addCriterion("acd.createdTime not between", value1, value2, "createdtime");
			return (Criteria) this;
		}

		public Criteria andUseridIsNull() {
			addCriterion("acd.userId is null");
			return (Criteria) this;
		}

		public Criteria andUseridIsNotNull() {
			addCriterion("acd.userId is not null");
			return (Criteria) this;
		}

		public Criteria andUseridEqualTo(String value) {
			addCriterion("acd.userId =", value, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridNotEqualTo(String value) {
			addCriterion("acd.userId <>", value, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridGreaterThan(String value) {
			addCriterion("acd.userId >", value, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridGreaterThanOrEqualTo(String value) {
			addCriterion("acd.userId >=", value, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridLessThan(String value) {
			addCriterion("acd.userId <", value, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridLessThanOrEqualTo(String value) {
			addCriterion("acd.userId <=", value, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridLike(String value) {
			addCriterion("acd.userId like", value, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridNotLike(String value) {
			addCriterion("acd.userId not like", value, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridIn(List<String> values) {
			addCriterion("acd.userId in", values, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridNotIn(List<String> values) {
			addCriterion("acd.userId not in", values, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridBetween(String value1, String value2) {
			addCriterion("acd.userId between", value1, value2, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridNotBetween(String value1, String value2) {
			addCriterion("acd.userId not between", value1, value2, "userid");
			return (Criteria) this;
		}

		public Criteria andUsernameIsNull() {
			addCriterion("acd.userName is null");
			return (Criteria) this;
		}

		public Criteria andUsernameIsNotNull() {
			addCriterion("acd.userName is not null");
			return (Criteria) this;
		}

		public Criteria andUsernameEqualTo(String value) {
			addCriterion("acd.userName =", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotEqualTo(String value) {
			addCriterion("acd.userName <>", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameGreaterThan(String value) {
			addCriterion("acd.userName >", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameGreaterThanOrEqualTo(String value) {
			addCriterion("acd.userName >=", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameLessThan(String value) {
			addCriterion("acd.userName <", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameLessThanOrEqualTo(String value) {
			addCriterion("acd.userName <=", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameLike(String value) {
			addCriterion("acd.userName like", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotLike(String value) {
			addCriterion("acd.userName not like", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameIn(List<String> values) {
			addCriterion("acd.userName in", values, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotIn(List<String> values) {
			addCriterion("acd.userName not in", values, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameBetween(String value1, String value2) {
			addCriterion("acd.userName between", value1, value2, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotBetween(String value1, String value2) {
			addCriterion("acd.userName not between", value1, value2, "username");
			return (Criteria) this;
		}

		public Criteria andTaskidIsNull() {
			addCriterion("acd.taskId is null");
			return (Criteria) this;
		}

		public Criteria andTaskidIsNotNull() {
			addCriterion("acd.taskId is not null");
			return (Criteria) this;
		}

		public Criteria andTaskidEqualTo(String value) {
			addCriterion("acd.taskId =", value, "taskid");
			return (Criteria) this;
		}

		public Criteria andTaskidNotEqualTo(String value) {
			addCriterion("acd.taskId <>", value, "taskid");
			return (Criteria) this;
		}

		public Criteria andTaskidGreaterThan(String value) {
			addCriterion("acd.taskId >", value, "taskid");
			return (Criteria) this;
		}

		public Criteria andTaskidGreaterThanOrEqualTo(String value) {
			addCriterion("acd.taskId >=", value, "taskid");
			return (Criteria) this;
		}

		public Criteria andTaskidLessThan(String value) {
			addCriterion("acd.taskId <", value, "taskid");
			return (Criteria) this;
		}

		public Criteria andTaskidLessThanOrEqualTo(String value) {
			addCriterion("acd.taskId <=", value, "taskid");
			return (Criteria) this;
		}

		public Criteria andTaskidLike(String value) {
			addCriterion("acd.taskId like", value, "taskid");
			return (Criteria) this;
		}

		public Criteria andTaskidNotLike(String value) {
			addCriterion("acd.taskId not like", value, "taskid");
			return (Criteria) this;
		}

		public Criteria andTaskidIn(List<String> values) {
			addCriterion("acd.taskId in", values, "taskid");
			return (Criteria) this;
		}

		public Criteria andTaskidNotIn(List<String> values) {
			addCriterion("acd.taskId not in", values, "taskid");
			return (Criteria) this;
		}

		public Criteria andTaskidBetween(String value1, String value2) {
			addCriterion("acd.taskId between", value1, value2, "taskid");
			return (Criteria) this;
		}

		public Criteria andTaskidNotBetween(String value1, String value2) {
			addCriterion("acd.taskId not between", value1, value2, "taskid");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table T_Apply_CheckDetail
	 * @mbggenerated  Tue Sep 26 14:13:16 CST 2017
	 */
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table T_Apply_CheckDetail
     *
     * @mbggenerated do_not_delete_during_merge Tue Sep 26 13:40:49 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}