package model;

import org.springframework.beans.factory.annotation.Autowired;

public class UseBeta {
	
	@Autowired 
	Beta beta3;
	
	public void service(){
		beta3.sendSpam("�̰��� ���̼���.");
	}
}
