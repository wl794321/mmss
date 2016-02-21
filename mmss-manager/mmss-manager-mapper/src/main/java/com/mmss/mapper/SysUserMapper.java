package com.mmss.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.mmss.pojo.SysUser;
import com.mmss.pojo.SysUserExample;
import com.mmss.pojo.SysUserQueryModel;

public interface SysUserMapper {
    int countByExample(SysUserExample example);

    int deleteByExample(SysUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    List<SysUser> selectByExample(SysUserExample example);

    SysUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
    
    List<SysUser> getByConditionPage(SysUserQueryModel sysUserQueryModel);
}