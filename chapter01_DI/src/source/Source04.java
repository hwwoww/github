package source;

import java.util.Map;
import java.util.Properties;

public class Source04 {

		public static void main(String[] args) {
			Map prop = new Properties();
			//map �迭�� �ϳ� 
			Properties pr = new Properties(); 
			//generic ��ü�� <String,String> ���� ������ �� 'Ư�� map' 
			//���� ȯ�溯�� �� ������ ���� ����
			pr.setProperty("username", "haeri");
			pr.setProperty("password", "123");	//�̷�������
			
			//map  �� property ������ �ٸ��� 
			//map�� ����.. �����ް��� �ϴ� data �� ���� + ������ ���
			//property�� ��� �����ް��� �ϴ� data�� ���ڰ���� �̷���� ����
		}
}
