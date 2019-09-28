package com.zl.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zl.pojo.Role;

public interface RoleDao {
	public int deleteRoleAll();
	public int deleteRole(@Param("id")int id);
	public int addRole(Role role);
	public int updateRole(Role role);
	public Role queryRoleById(@Param("id")int id);
	public Role roleAndPower(int id);
	public List<Role> queryRoleAll();

}
