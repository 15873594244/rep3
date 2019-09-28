package com.zl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.dao.TuserDao;
import com.zl.pojo.Tuser;
import com.zl.service.TuserService;
@Service
public class TuserServiceImpl implements TuserService {
	@Autowired
	private TuserDao tuserDao;

	@Override
	public Tuser logoin(Tuser user) {
		
		return tuserDao.logoin(user);
	}


}
