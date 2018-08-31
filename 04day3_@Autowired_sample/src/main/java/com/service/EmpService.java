package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.EmpDAO;
import com.dto.EmpDTO;

public class EmpService {

	@Autowired
	EmpDAO dao;
	
	public EmpService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpService(EmpDAO dao) {
		this.dao = dao;
	}
	
	public List<EmpDTO> list(){
		return dao.list();
	}
	
}
