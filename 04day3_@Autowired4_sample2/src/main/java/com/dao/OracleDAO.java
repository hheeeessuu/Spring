package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.dto.EmpDTO;

public class OracleDAO implements DatabaseDAO {

	@Override
	public List<EmpDTO> list() {
		List<EmpDTO> list= new ArrayList<>();
		list.add(new EmpDTO(10, "이순신", 1000));
		return list;
	}

}
