package com.question.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.utils.IDUtils;
import com.question.mapper.AdminMapper;
import com.question.pojo.Admin;
import com.question.pojo.AdminExample;
import com.question.pojo.AdminExample.Criteria;
import com.question.service.AdminService;




@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
 private AdminMapper adminMapper;

	@Override
	public void addAdmin(Admin admin) {
		admin.setAdmid(IDUtils.genItemId());
		
		//user.setState("0");
		adminMapper.insert(admin);
		
	}

	@Override
	public List<Admin> findAdminList() {
		AdminExample example=new AdminExample();
		List<Admin> list=adminMapper.selectByExample(example);
		
		return list;
	}

	
	public Admin getAdminById(Long admid) {
		Admin admin=adminMapper.selectByPrimaryKey(admid);
		return admin;
	}

	@Override
	public void delete(Long admid) {
		adminMapper.deleteByPrimaryKey(admid);
		
	}

	@Override
	public void updateAdmin(Admin admin) {
		adminMapper.updateByPrimaryKey(admin);
	}

	
	public Admin getAdminByAdminAndPassword(Admin admin) {
		AdminExample adminExample=new AdminExample();
		System.out.println("----");
		Criteria criteria=adminExample.createCriteria();
		criteria.andAdmusernameEqualTo(admin.getAdmusername());
		criteria.andAdmpwdEqualTo(admin.getAdmpwd());
		
		
		Admin u=null;
		System.out.println("----");
		List<Admin> adminList=adminMapper.selectByExample(adminExample);
		
		if(null!=adminList&&adminList.size()>0){
			u=adminList.get(0);
		}
		return u;
	}
	
	
 
}
