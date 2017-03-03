package source;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Beta;
import model.Gamma;
import model.UseBeta;

public class Source03 {

	public static void main(String[] args) {

		BeanFactory factory = new ClassPathXmlApplicationContext("spring_config(2).xml");

		System.out.println(factory != null);
		boolean f = factory.containsBean("beta");
		System.out.println("==?" + f);
		Beta b = factory.getBean("beta2", Beta.class);

		b.sendSpam("¾È³ç³ª¾ß~");
		
		////////////////////////////////
		
		UseBeta ub = factory.getBean("ub", UseBeta.class);
		ub.service();
		
		Gamma gamma = factory.getBean("gamma", Gamma.class);
		gamma.toSysout();
		
	}
}