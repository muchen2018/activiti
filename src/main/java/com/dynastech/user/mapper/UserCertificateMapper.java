package com.dynastech.user.mapper;

import com.dynastech.user.entity.UserCertificate;
import com.dynastech.user.entity.UserCertificateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserCertificateMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table RS_UserCertificate
	 * @mbggenerated  Thu Aug 31 09:35:03 CST 2017
	 */
	int countByExample(UserCertificateExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table RS_UserCertificate
	 * @mbggenerated  Thu Aug 31 09:35:03 CST 2017
	 */
	int deleteByExample(UserCertificateExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table RS_UserCertificate
	 * @mbggenerated  Thu Aug 31 09:35:03 CST 2017
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table RS_UserCertificate
	 * @mbggenerated  Thu Aug 31 09:35:03 CST 2017
	 */
	int insert(UserCertificate record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table RS_UserCertificate
	 * @mbggenerated  Thu Aug 31 09:35:03 CST 2017
	 */
	int insertSelective(UserCertificate record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table RS_UserCertificate
	 * @mbggenerated  Thu Aug 31 09:35:03 CST 2017
	 */
	List<UserCertificate> selectByExample(UserCertificateExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table RS_UserCertificate
	 * @mbggenerated  Thu Aug 31 09:35:03 CST 2017
	 */
	UserCertificate selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table RS_UserCertificate
	 * @mbggenerated  Thu Aug 31 09:35:03 CST 2017
	 */
	int updateByExampleSelective(@Param("record") UserCertificate record,
			@Param("example") UserCertificateExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table RS_UserCertificate
	 * @mbggenerated  Thu Aug 31 09:35:03 CST 2017
	 */
	int updateByExample(@Param("record") UserCertificate record, @Param("example") UserCertificateExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table RS_UserCertificate
	 * @mbggenerated  Thu Aug 31 09:35:03 CST 2017
	 */
	int updateByPrimaryKeySelective(UserCertificate record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table RS_UserCertificate
	 * @mbggenerated  Thu Aug 31 09:35:03 CST 2017
	 */
	int updateByPrimaryKey(UserCertificate record);
}