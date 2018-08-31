import org.springframework.context.support.GenericXmlApplicationContext;

import com.app.CalcBean;

public class CalcTest {

	public static void main(String[] args) {

		GenericXmlApplicationContext ctx 
= new GenericXmlApplicationContext("calc.xml");

		CalcBean calc = ctx.getBean("calc", CalcBean.class);

		int sum = calc.sum(10, 20);
		System.out.println(sum);

		CalcBean calc2 = ctx.getBean("calc2", CalcBean.class);

		int sum2 = calc2.sum(1, 2);
		System.out.println(sum2);
	}

}
