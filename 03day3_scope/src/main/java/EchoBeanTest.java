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
      
		EchoBean bean2 = 
				ctx.getBean("aaa",EchoBean.class);
		
		System.out.println(bean == bean2);
		
		EchoBean bean3 = 
				ctx.getBean("bbb",EchoBean.class);
      
		EchoBean bean4 = 
				ctx.getBean("bbb",EchoBean.class);
		
		System.out.println(bean3 == bean4);
	}

}
