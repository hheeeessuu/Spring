import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.app.EchoBean;

public class EchoBeanTest {

	public static void main(String[] args) {
		
		//IoC 컨테이너 생성
		MessageSource ctx =
	new GenericXmlApplicationContext("echo.xml");
		
		String mesg = ctx.getMessage("greet", null, Locale.CANADA);
		System.out.println(mesg);

	}

}
