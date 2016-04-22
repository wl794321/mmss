package com.mmss.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.mmss.pojo.SysPermission;
import com.mmss.pojo.SysPermissionExample;

public interface SysPermissionMapper {
    int countByExample(SysPermissionExample example);

    int deleteByExample(SysPermissionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysPermission record);

    int insertSelective(SysPermission record);

    List<SysPermission> selectByExample(SysPermissionExample example);

    SysPermission selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysPermission record, @Param("example") SysPermissionExample example);

    int updateByExample(@Param("record") SysPermission record, @Param("example") SysPermissionExample example);

    int updateByPrimaryKeySelective(SysPermission record);

    int updateByPrimaryKey(SysPermission record);

	List<SysPermission> findResourceAllByTypeAndPidNull(String resourceType);

	List<SysPermission> findResourceAllByTypeAndPid(@Param("resourceType") String resourceType, @Param("parentid") Long parentid);

	


	
}