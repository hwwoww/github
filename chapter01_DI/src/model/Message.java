package model;


public class Message {
	public Message() {
		System.out.println("create Message Bean ! ");
	}
	
	public String createGreet() {
		String[] ar = new String[]{ "안녕하세요", "곤니찌와","하이", "봉쥬르" };	// 인사 멘트 몇개 설정해두고..
		// 그중에하나 랜덤 리턴시키게끔 해보자.
		return ar[(int)(Math.random()*ar.length)];
	}
}
// 어디서든 사용을 해야될 객체..
