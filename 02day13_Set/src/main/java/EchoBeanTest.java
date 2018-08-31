import java.util.List;
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
	
	    Set<EchoBean> list = another.getSet();
	    for (EchoBean echo : list) {
			System.out.println(echo.sayEcho());
		}
		
	}

}
