package model;

public class Alpha {
	String str;
	public Alpha() {
		System.out.println("alpha() create");
	}
	public Alpha(String str) {
		this.str = str;
		System.out.println("alpha(String) create.."+str);
	}
	public Alpha(int num){
		System.out.println("alpha(int) create.."+num);
	}
	public Alpha(String str, int num, boolean flag) {
		System.out.println("alpha(String,int,bloolean) create");
	}
	
}
