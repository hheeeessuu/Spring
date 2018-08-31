package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.dto.EmpDTO;

public class MySQLDAO implements DatabaseDAO {

	@Override
	public List<EmpDTO> list() {
		List<EmpDTO> list= new ArrayList<>();
		list.add(new EmpDTO(20, "유관순", 2000));
		return list;
	}

}
