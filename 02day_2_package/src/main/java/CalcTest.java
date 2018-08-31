import org.springframework.context.support.GenericXmlApplicationContext;

import com.app.CalcBean;

public class CalcTest {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx
	 = new GenericXmlApplicationContext("com/app/calc.xml");
	
       CalcBean calc =
    		   ctx.getBean("calc", CalcBean.class);
       
		int sum = calc.sum(10, 20);
		System.out.println(sum);

	}

}
