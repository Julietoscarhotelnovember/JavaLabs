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
		
		//inSrc 읽어서 temp에 쓰기 하고 싶다
		input.read(temp, 0, temp.length); //.read()가 temp에 write 역할까지 가능하다
		System.out.println("temp after: "+Arrays.toString(temp));
		
		output.write(temp, 5, 5); //자기자신(output)에 temp의 5에서 5개를 읽어서 쓰겠다
		//read와 write에 내부적으로 읽고 쓰는 기능들이 들어가있다
		System.out.println("outSrc before: "+Arrays.toString(outSrc));
		outSrc=output.toByteArray();
		System.out.println("outSrc after: "+Arrays.toString(outSrc));
	}

}
