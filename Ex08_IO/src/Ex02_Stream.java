import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Ex02_Stream {

	public static void main(String[] args) {
		byte[] inSrc={0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc=null;
		
		ByteArrayInputStream input=null;
		ByteArrayOutputStream output=null;
		
		input=new ByteArrayInputStream(inSrc);
		output=new ByteArrayOutputStream();
		
		byte[] temp=new byte[10];
		System.out.println("temp before: "+Arrays.toString(temp));
		
		//inSrc �о temp�� ���� �ϰ� �ʹ�
		input.read(temp, 0, temp.length); //.read()�� temp�� write ���ұ��� �����ϴ�
		System.out.println("temp after: "+Arrays.toString(temp));
		
		output.write(temp, 5, 5); //�ڱ��ڽ�(output)�� temp�� 5���� 5���� �о ���ڴ�
		//read�� write�� ���������� �а� ���� ��ɵ��� ���ִ�
		System.out.println("outSrc before: "+Arrays.toString(outSrc));
		outSrc=output.toByteArray();
		System.out.println("outSrc after: "+Arrays.toString(outSrc));
	}

}
