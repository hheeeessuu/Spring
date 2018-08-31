import org.springframework.context.support.GenericXmlApplicationContext;

import com.app.EchoBean;

public class EchoBeanTest {

	public static void main(String[] args) {
		
		//IoC 컨테이너 생성
		GenericXmlApplicationContext ctx =
	new GenericXmlApplicationContext("echo.xml");
		
		//생성된 bean 가져오기
		EchoBean bean = 
				ctx.getBean("aaa",EchoBean.class);
        String mesg = bean.sayEcho();
        System.out.println(mesg);
	}
}
