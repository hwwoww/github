package model;

public class ExMessage extends Message{
	
	public String createGreet(){
		String[] ar = new String[]{"������", "happny new yr", "���Ͻų�"};
		return ar[(int)(Math.random()*ar.length)];
	}

}
