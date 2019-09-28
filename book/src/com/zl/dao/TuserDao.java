package com.zl.dao;

import org.apache.ibatis.annotations.Param;

import com.zl.pojo.Tuser;

public interface TuserDao {
	public Tuser logoin(Tuser user);
	public int register(Tuser user);
	public Tuser queryUserByName(@Param("username")String username);
	public Tuser userAndRole(@Param("username")String username);
	public Tuser userAndRoleAndPower(@Param("username")String username);
	
}
