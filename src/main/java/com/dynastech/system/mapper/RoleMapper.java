package com.dynastech.system.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.dynastech.system.entity.Role;
import com.dynastech.system.entity.RoleExample;

public interface RoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RS_Role
     *
     * @mbggenerated Thu Aug 10 10:05:52 CST 2017
     */
    int countByExample(RoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RS_Role
     *
     * @mbggenerated Thu Aug 10 10:05:52 CST 2017
     */
    int deleteByExample(RoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RS_Role
     *
     * @mbggenerated Thu Aug 10 10:05:52 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RS_Role
     *
     * @mbggenerated Thu Aug 10 10:05:52 CST 2017
     */
    int insert(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RS_Role
     *
     * @mbggenerated Thu Aug 10 10:05:52 CST 2017
     */
    int insertSelective(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RS_Role
     *
     * @mbggenerated Thu Aug 10 10:05:52 CST 2017
     */
    List<Role> selectByExample(RoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RS_Role
     *
     * @mbggenerated Thu Aug 10 10:05:52 CST 2017
     */
    Role selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RS_Role
     *
     * @mbggenerated Thu Aug 10 10:05:52 CST 2017
     */
    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RS_Role
     *
     * @mbggenerated Thu Aug 10 10:05:52 CST 2017
     */
    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RS_Role
     *
     * @mbggenerated Thu Aug 10 10:05:52 CST 2017
     */
    int updateByPrimaryKeySelective(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RS_Role
     *
     * @mbggenerated Thu Aug 10 10:05:52 CST 2017
     */
    int updateByPrimaryKey(Role record);
    
    /**
     * 根据orgId 查询role
     * @param orgId
     * @return
     */
    List<Role>selectRolesByOrgId(@Param("orgId")String orgId,@Param("str")String str);
    
    /**
     * 查询该组织机构下的角色  select2 使用
     * @param orgId
     * @param str
     * @return
     */
    List<Map<String,String>>selectRolesByOrgIdForSelect2(@Param("ids")String[] orgId,@Param("str")String str);
    
    /**
     * 通过userId 查询用户拥有的角色
     * @param userId
     * @return
     */
    List<Role>selectRolesByUserId(String userId);
    
    
    /**
     * 通过组织机构ids  查询roles
     * @param orgIds
     * @return
     */
    List<Role> selectRoleByOrgIds(@Param("ids")List<String> orgIds,@Param("typeId")String typeId);
}