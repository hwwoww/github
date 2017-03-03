package model;

public class Beta {

	String target;
	int count;

	public Beta() {
		System.out.println("create Beta Bean()");
	}
	
	
	// generate setter >> generate getters and setters >> select setters 
	public void setTarget(String target) {
		this.target = target;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
	public void sendSpam(String ment) {
		for (int i = 0; i < count; i++) {
			System.out.println(target + "<<<" + ment);
		}
	}
}
