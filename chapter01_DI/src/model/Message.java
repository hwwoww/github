package model;


public class Message {
	public Message() {
		System.out.println("create Message Bean ! ");
	}
	
	public String createGreet() {
		String[] ar = new String[]{ "�ȳ��ϼ���", "������","����", "���긣" };	// �λ� ��Ʈ � �����صΰ�..
		// ���߿��ϳ� ���� ���Ͻ�Ű�Բ� �غ���.
		return ar[(int)(Math.random()*ar.length)];
	}
}
// ��𼭵� ����� �ؾߵ� ��ü..
