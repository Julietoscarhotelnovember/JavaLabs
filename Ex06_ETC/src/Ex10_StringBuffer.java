//���ڿ� ����
//String str="A"
//for (str+="A") 10000�� -> ��� �޸� ���Ҵ��� �Ͼ��, ��ȿ����
//String�� �÷���ȭ > StringBuffer, StringBuilder
public class Ex10_StringBuffer {

	public static void main(String[] args) {
/*		String str="A";  �̷��Դ� ��������
			for (int i=0; i<10000; i++) {
			str+="B";
		}*/
		
		//�뷮�� ������ �߰��� �̰� �ξ� ������
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity()); //�⺻ 16�� -> ���� �þ��
		sb.append("A"); //���ڿ� �߰�
			
	}
}
