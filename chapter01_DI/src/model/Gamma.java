package model;

import java.util.List;

public class Gamma {
	String[] array;
	List list;
	
	public void setArray(String[] array) {
		this.array = array;
	}

	public void setList(List list) {
		this.list = list;
	}

	public void toSysout() {
		System.out.println(array+".."+array.length);
		for(String m: array) {
			System.out.println("¡æ " +m);
		}
		System.out.println(list.getClass().getName()+".."+list.toString());
	}
	
}
