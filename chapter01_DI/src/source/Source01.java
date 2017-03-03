package source;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Message;

public class Source01 {
	public static void main(String[] args) {
		BeanFactory factory = 
				new ClassPathXmlApplicationContext("spring_config.xml");
		BeanFactory factory2 = 
				new ClassPathXmlApplicationContext("spring_config.xml");
		
		System.out.println("스프링 정상 가동");
		System.out.println(factory.toString());
		Message m = (Message)factory.getBean("msg");	// "id"
		String gstr = m.createGreet();
		System.out.println(gstr);
		System.out.println(factory.getBean("msg"));
		System.out.println(factory.getBean("msg"));
		System.out.println(factory.getBean("msg"));
		
		List li = (List)factory.getBean("list");
		Class c = li.getClass();
			System.out.println(c.getName());
			
	}
}
