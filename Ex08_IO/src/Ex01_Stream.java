import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

//IO�Է�
//stream(����� ���): ����Ʈ ������ ������ ó�� -> byte[] ���

//�ڹ�api���� �߻�Ŭ������ ����
//inputstream: �Է�(read)
//outputstream: ���(write)

//���� �߻�Ŭ������ ����ϴ� Ŭ������ ����
//��� ���� ����
//file: FileInputStream, FileOutPutStream
//memory: ByteArrayInputStream, ByteArryOutPutStream
//��Ÿ �����, ���μ������� ����

//������Ʈ��(Buffer...)
//File read write ���� ���(I/O disk ���� ���)

public class Ex01_Stream {

	public static void main(String[] args) {
		byte[] inSrc={0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc=null;
		ByteArrayInputStream input=null;
		ByteArrayOutputStream output=null;
		
		input=new ByteArrayInputStream(inSrc); //read
		output=new ByteArrayOutputStream(); //write
		System.out.println("outSrc before: "+Arrays.toString(outSrc));
		
		//���İ��� ������ ����ֱ�
		int data=0;
		while((data=input.read())!=-1) { //read�� �� ���� ���� ������ -1�� �����Ѵ�
			//�� ����Ʈ�� �о data�� �ִ´�
			//System.out.println(data);
			
			//.read() ��ü�� next�� ������ �ִ�
			//System.out.println("read�� �� ���: "+input.read()); 
			//�а� Ŀ���� �ٷ� �ѱ�µ�, �̵��� ���� ���ͼ� ������ ���´�
			
			output.write(data);
			//���� data�� �ڱ��ڽ�(outputstream��ü)���� �ִ� ��
		}
		outSrc=output.toByteArray(); //ByteArrayOutputStream �ȿ� ���, Byte[] ���·� ����
		System.out.println("outSrc before: "+Arrays.toString(outSrc));
	}
}
