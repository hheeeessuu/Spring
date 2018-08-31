package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.dto.EmpDTO;

public class EmpDAO {

	
	public List<EmpDTO> list(){
	   // 실제로는 DB 연동 코드 필요
		List<EmpDTO> list= new ArrayList<>();
		list.add(new EmpDTO(10, "이순신", 1000));
		list.add(new EmpDTO(20, "유관순", 2000));
		list.add(new EmpDTO(30, "강감찬", 3000));
		return list;
	}//end list()
	
}



