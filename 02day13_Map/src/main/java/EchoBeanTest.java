import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.app.AnotherBean;
import com.app.EchoBean;

public class EchoBeanTest {

	public static void main(String[] args) {
		
		//IoC 컨테이너 생성
		GenericXmlApplicationContext ctx =
	new GenericXmlApplicationContext("echo.xml");
		
		AnotherBean another =
				ctx.getBean("another",AnotherBean.class);
	
	   Map<String, EchoBean> map = another.getMap();
	   Set<String> keys = map.keySet();
	   for (String key : keys) {
		EchoBean echo = map.get(key);
		System.out.println(echo.sayEcho());
	   }
		
	}//end main

}//end class
