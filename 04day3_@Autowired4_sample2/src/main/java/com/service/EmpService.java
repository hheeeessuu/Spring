package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.dao.DatabaseDAO;
import com.dto.EmpDTO;

public class EmpService {

	@Autowired
	@Qualifier("oracle")
	DatabaseDAO dao;  //인터페이스
	
	
	
	public List<EmpDTO> list(){
		return dao.list();
	}
	
}
