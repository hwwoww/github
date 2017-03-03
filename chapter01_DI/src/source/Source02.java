package source;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.AlertMessage;

public class Source02 {
	public static void main(String[] args) {
		
		BeanFactory factory = 
				new ClassPathXmlApplicationContext("spring_config.xml");
		
		AlertMessage at = (AlertMessage)factory.getBean("alert", AlertMessage.class);
		at.show(); 
	}

}
