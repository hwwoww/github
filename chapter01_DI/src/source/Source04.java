package source;

import java.util.Map;
import java.util.Properties;

public class Source04 {

		public static void main(String[] args) {
			Map prop = new Properties();
			//map 계열의 하나 
			Properties pr = new Properties(); 
			//generic 자체가 <String,String> 으로 설정이 된 '특수 map' 
			//보통 환경변수 값 설정시 많이 쓰임
			pr.setProperty("username", "haeri");
			pr.setProperty("password", "123");	//이런식으로
			
			//map  과 property 설정이 다르다 
			//map은 보통.. 설정받고자 하는 data 가 문자 + 숫자인 경우
			//property의 경우 설정받고자 하는 data가 문자값들로 이루어진 형태
		}
}
