package com.question.service;

import java.util.List;

import com.question.pojo.Admin;

public interface AdminService {

	void addAdmin(Admin admin);

	List<Admin> findAdminList();

	Admin getAdminById(Long admid);

	void delete(Long admid);



	void updateAdmin(Admin admin);

	Admin getAdminByAdminAndPassword(Admin admin);

}
