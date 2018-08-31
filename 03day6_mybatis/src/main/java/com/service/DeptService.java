package com.service;

import java.util.List;

import com.dao.DeptDAO;
import com.dto.DeptDTO;

public class DeptService {
	
	DeptDAO dao;
	
	
	
	public void setDao(DeptDAO dao) {
		this.dao = dao;
	}



	public List<DeptDTO> list() {
		return dao.list();
	}
}
