import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.app.EchoBean;

public class EchoBeanTest {

	public static void main(String[] args) {
		
		// IoC 컨테이너 생성
		GenericApplicationContext ctx = new GenericXmlApplicationContext("echo.xml");
		
		// 생성된 bean 가져오기
		EchoBean bean = ctx.getBean("aaa", EchoBean.class);
		String mesg = bean.sayEcho();
		System.out.println(mesg);
		
		/*EchoBean bean2 = (EchoBean)ctx.getBean("aaa");
		System.out.println(bean2.sayEcho());*/
	}

}
