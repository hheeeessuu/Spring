package com.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.dto.DeptDTO;

public class DeptDAO {
	@Autowired
	SqlSessionTemplate template;
	
	// 로직처리
	public List<DeptDTO> list() {
		return template.selectList("selectAll");
	}
	
	public void insert(DeptDTO dto) {
		template.insert("insert", dto);
	}
	
	public void update(DeptDTO dto) {
		template.update("update", dto);
	}
	
	public void delete(int deptno) {
		template.delete("delete", deptno);
	}
	
	// 트랜잭션
	public void tran() {
		DeptDTO dto = new DeptDTO(14, "xxx", "xxx2");
		template.insert("insert", dto);
		template.delete("delete", 9);
	}
}
