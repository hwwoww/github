package model;

public class ExMessage extends Message{
	
	public String createGreet(){
		String[] ar = new String[]{"새복많", "happny new yr", "근하신년"};
		return ar[(int)(Math.random()*ar.length)];
	}

}
