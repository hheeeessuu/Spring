package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.dao.DeptDAO;
import com.dto.DeptDTO;

//@Component("xxx")
@Service("xxx")
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
	
	// 트랜잭션
	@Transactional
	public void tran() {
		dao.tran();
	}
}
