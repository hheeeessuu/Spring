import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.app.AnotherBean;
import com.app.EchoBean;
import com.app.EchoBeanName;

public class EchoBeanTest {

	public static void main(String[] args) {
		
		//IoC 컨테이너 생성
		GenericXmlApplicationContext ctx =
	new GenericXmlApplicationContext("echo.xml");
		
		EchoBeanName kkk = ctx.getBean("kkk", EchoBeanName.class);
		List<String> names = kkk.getNames();
		for(String x : names) {
			System.out.println(x);
		}	
	}
}
