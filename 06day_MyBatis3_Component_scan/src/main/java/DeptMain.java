import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.DeptDTO;
import com.service.DeptService;

public class DeptMain {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/dept.xml");
		
		DeptService service = ctx.getBean("xxx", DeptService.class);
		
		//1. 저장
//		DeptDTO xx = new DeptDTO(1, "개발", "서울");
//		service.insert(xx);
		
		//2. 수정
//		DeptDTO xx2 = new DeptDTO(1, "개발2", "서울2");
//		service.update(xx2);
		
		//3. 삭제
//		service.delete(1);
		
		// 트랜잭션
//		service.tran();
		
		List<DeptDTO> list = service.list();
		for (DeptDTO dto : list) {
			System.out.println(dto);
		}
	}// end main
}// end class
