import java.util.StringTokenizer;

//���� ���� �Լ�
public class Ex06_String_Function {

	public static void main(String[] args) {
		// String Ŭ������ ������ �ִ� public �ڿ��� ����� �� �ִ�
		// Ȱ�뵵�� ����
		String str; // null
		String str2 = ""; // ���ڿ� �ʱ�ȭ
		char c = ' '; // �ѹ��� �ʱ�ȭ
		String[] strarray = { "ab", "abc", "abcd" };
		for (String s : strarray) {
			System.out.println(s);
		}

		String s = "hello";
		String concat_s = s.concat("world");
		System.out.println(concat_s);

		boolean bo = s.contains("h");
		System.out.println(bo);
		bo = s.contains("ell");
		System.out.println(bo);
		bo = s.contains("lle");
		System.out.println(bo);

		String s2 = "a b c d";
		System.out.println(s2.length());
		String filename = "hello java, world";
		int indexvalue = filename.indexOf(",");
		System.out.println(indexvalue);
		indexvalue = filename.indexOf("l");
		System.out.println(indexvalue);
		indexvalue = filename.indexOf("hello");
		System.out.println(indexvalue);
		indexvalue = filename.indexOf("hollo");
		System.out.println(indexvalue); // ���� ���� ��� -1 ��ȯ -> 0���� ũ�� ã�� ���ڰ� �ִ�

		indexvalue = filename.lastIndexOf("l");
		System.out.println(indexvalue);

		// ���� ����
		String result = "superman";
		System.out.println(result.substring(1));
		System.out.println(result.substring(1, 2)); // �̰� -1�� �Ѵٴ���
		System.out.println("Test: " + result.substring(1, 1));

		// ����
		String filename2 = "cat.jpg";
		// ���ϸ�� Ȯ���ڸ� �и��ؼ� ����غ���
		int position = filename2.indexOf(".");
		String fn = filename2.substring(0, position);
		// String ext=filename2.substring(position+1, filename2.length());
		String ext = filename2.substring(++position); // ���� �ڵ�
		System.out.println(fn);
		System.out.println(ext);

		// ġȯ�Լ�
		String s4 = "ABCD";
		String result2 = s4.replace("A", "��");
		System.out.println(result2);
		result2 = s4.replace("BCD", "ȫ�浿�ٺ�");
		System.out.println(result2);

		// s4.charAt(index)
		// s4.endsWith(suffix)

		// ����: a.hwp, b.txt, c.jpg, ...
		String file2 = "1.jpg";
		System.out.println(file2.endsWith("jpg"));

		String s5 = "abc";
		System.out.println(s5.equals("Abc")); // ��ҹ��� ����
		System.out.println(s5.equalsIgnoreCase("Abc")); // �ȱ���

		// split-Ư�� �����ڷ� �и�
		String s6 = "���۸�,��Ƽ,�����,������,������";
		String[] namearray = s6.split(",");
		for (String str3 : namearray) {
			System.out.println(str3);
		}
		String filename3 = "korea.jpg";
		String[] filearray = filename3.split(".");
		for (String str1 : filearray) {
			System.out.println(str1);
		} // �ȳ����°� ����
			// split�� ����ǥ���Ŀ� ������->.�� �����ڷ� ���� �ʴ´�-> \\.���� ǥ���ؾ� ����
			// ǥ��, ��� ���, DB���� ��λ��

		// �������� - ����ǥ���� 5�� �����
		// ���¹�ȣ, �ֹε�Ϲ�ȣ, IP, ������Ϲ�ȣ(34ȣ6654)
		// �����ȣ, �ǻ��Ϲ�ȣ, ī���ȣ, ���ε�Ϲ�ȣ, ����ȣ
		// ȸ�����Խ� �̸�
		// ����� ��������Ʈ���� Ȯ��
		// 8��2�ϱ���

		String s8 = "a//b.c,d-f";
		// a b c d f �и��� tokenizer
		StringTokenizer sto = new StringTokenizer(s8, "/.,-"); // ���ϴ� ������ ���� �Է�
		while (sto.hasMoreTokens()) { // �����ڰ� �����ϴ� ���
			System.out.println(sto.nextToken()); // ���� ��ū ���
		}
		System.out.println("*******");
		String[] tokens=new String[10];
		int index=0;
		StringTokenizer sto2=new StringTokenizer(s8, "/.,-");
		while(sto2.hasMoreTokens()) {
			tokens[index++]=sto2.nextToken();
		}
		for(String a: tokens) {
			System.out.println(a);
		}
		StringTokenizer sto3=new StringTokenizer(s8, "/.,-", true); //true ���� �����ڵ� ���ڷ� ����
		while(sto3.hasMoreTokens()) {
			System.out.println(sto3.nextToken());
		}
		
		//Ȱ��
		//�Խ��� ���� ���ε� �� ��
		//1.jpg�� �����ϴµ�  �ٽ� 1.jpg�� �ø��� ��� ���� _1 �߰�
		String uploadfile="hello.hwp";
		String[] upload=uploadfile.split("\\.");
		System.out.println("���ϸ�: "+upload[0]+" "+"Ȯ����: "+upload[1]);
		String newfile=upload[0]+"_1."+upload[1];
		System.out.println(newfile);
		
		//����
		String s9="ȫ         ��              ��";
		//����ÿ� ȫ�浿���� �ϰ� �ʹ� -> ���������ϱ�
		System.out.println(s9.replace(" ", ""));
		
		String s1="             ȫ  ��  ��      ";
		System.out.println(s1.trim()); //���ӵ� �ٱ��� ���� ����

		//method chain
		String chain=s1.trim().replace(" ", ""); //����� ���ڿ��� ��� chain�� �����ϴ�, ����ϴ�
		System.out.println(chain);
		
		"ȫ�浿".length(); //String�� ���ڿ��̶� �ٷ� �̷��� ���� �͵� �����ϴ�
		//isEmpty() ���ڿ� ���̰� 0���� �ƴ���
		System.out.println("".isEmpty());
		//charAt() �ε����� ������ �ش� ��ġ�� ���� ��ȯ
		System.out.println("ȫ�浿".charAt(2));
		
		//����
		String sumstr="";
		int sum=0;
		String[] numberarr={"1", "2", "3", "4", "5"};
		//String �迭�� ������ �ִ� ���ڵ��� ���� ���ϱ�
		for (int i=0; i<numberarr.length; i++) {
			sumstr=numberarr[i];
			sum+=Integer.parseInt(sumstr);
		}
		System.out.println(sum);
		
		//����
		String jumin="123456-1234567";
		//�ֹι�ȣ�� �� ���ϱ�
		String[] tokens2=new String[13];
		sum=0;
		String sumstr2;
		for (int i=0; i<tokens2.length; i++) {
			tokens2[i]=jumin.replace("-", "").substring(i, i+1);
		}
		for(String a: tokens2) {
			sumstr2=a;
			sum+=Integer.parseInt(sumstr2);
		}
		System.out.println(sum);
		
		//String.valueOf(��) -> �ȿ� ���� ���� ������ ���ڷ� ����
		
		//����
		String s10="hello java, world";
		//,�� ���ְ� �ڿ� "�氡�氡"�� ��ġ�� �տ��� 4�ڸ����� ���
		System.out.println(s10.replace(",", "").concat("�氡�氡").substring(4));
		//chain.replace(",","").concat(sumstr2) //?????
		
		System.out.printf("%d-%s\n", 10, "A");
		//String Ŭ������ static �Լ� �� format ->  ������ ���·� ������ �����ؼ� �� �� �ִ�
		String formatter=String.format("%d-%s\n", 10, "A");
		System.out.println(formatter);
		
	}
}