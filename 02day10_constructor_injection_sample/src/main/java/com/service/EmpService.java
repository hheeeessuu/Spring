package com.service;

import java.util.List;

import com.dao.EmpDAO;
import com.dto.EmpDTO;

public class EmpService {

	EmpDAO dao;
	
	public EmpService(EmpDAO dao) {
		this.dao = dao;
	}
	
	public List<EmpDTO> list(){
		return dao.list();
	}
	
}
