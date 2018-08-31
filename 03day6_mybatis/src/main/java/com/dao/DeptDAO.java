package com.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import com.dto.DeptDTO;

public class DeptDAO {
	
	SqlSessionTemplate template;
	
	public void setTemplate(SqlSessionTemplate template) {
		this.template = template;
	}

	public List<DeptDTO> list() {
		return template.selectList("selectAll");
	}
 }
