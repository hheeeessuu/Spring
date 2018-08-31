import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.app.AnotherBean;

public class EchoBeanTest {

	public static void main(String[] args) {
		
		//IoC 컨테이너 생성
		GenericXmlApplicationContext ctx =
	new GenericXmlApplicationContext("echo.xml");
		
		AnotherBean another =
				ctx.getBean("another",AnotherBean.class);
	
	   Properties ppp = another.getPpp();
	   Set<String> keys = ppp.stringPropertyNames();
	   for (String key : keys) {
		 System.out.println(key 
				 +"=" + ppp.getProperty(key));
	   }
		
	}

}
