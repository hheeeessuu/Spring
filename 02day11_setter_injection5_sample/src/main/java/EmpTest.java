import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.EmpDTO;
import com.service.EmpService;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericXmlApplicationContext ctx 
		= new GenericXmlApplicationContext("classpath:emp.xml");
		
		EmpService service = 
				ctx.getBean("service",EmpService.class);
		
		List<EmpDTO> list = service.list();
		for (EmpDTO dto : list) {
			System.out.println(dto);
		}
		
	}

}
