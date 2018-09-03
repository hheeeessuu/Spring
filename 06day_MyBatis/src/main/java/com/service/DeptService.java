package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.DeptDAO;
import com.dto.DeptDTO;

public class DeptService {
	
	@Autowired
	DeptDAO dao;
	
	public List<DeptDTO> list() {
		return dao.list();
	}
	
	public void insert(DeptDTO dto) {
		dao.insert(dto);
	}
	
	public void update(DeptDTO dto) {
		dao.update(dto);
	}
	
	public void delete(int deptno) {
		dao.delete(deptno);
	}
}
