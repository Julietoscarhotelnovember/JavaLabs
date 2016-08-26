import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

//IO입력
//stream(입출력 통로): 바이트 단위로 데이터 처리 -> byte[] 사용

//자바api에서 추상클래스로 제공
//inputstream: 입력(read)
//outputstream: 출력(write)

//위의 추상클래스를 상속하는 클래스를 제공
//대상에 따라 제공
//file: FileInputStream, FileOutPutStream
//memory: ByteArrayInputStream, ByteArryOutPutStream
//기타 오디오, 프로세스에도 가능

//보조스트림(Buffer...)
//File read write 성능 향상(I/O disk 성능 향상)

public class Ex01_Stream {

	public static void main(String[] args) {
		byte[] inSrc={0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc=null;
		ByteArrayInputStream input=null;
		ByteArrayOutputStream output=null;
		
		input=new ByteArrayInputStream(inSrc); //read
		output=new ByteArrayOutputStream(); //write
		System.out.println("outSrc before: "+Arrays.toString(outSrc));
		
		//공식같은 데이터 집어넣기
		int data=0;
		while((data=input.read())!=-1) { //read가 더 읽을 것이 없으면 -1을 리턴한다
			//한 바이트씩 읽어서 data에 넣는다
			//System.out.println(data);
			
			//.read() 자체가 next를 가지고 있다
			//System.out.println("read한 값 출력: "+input.read()); 
			//읽고 커서를 바로 넘기는데, 이동된 값이 나와서 띄엄띄엄 나온다
			
			output.write(data);
			//받은 data를 자기자신(outputstream객체)한테 넣는 것
		}
		outSrc=output.toByteArray(); //ByteArrayOutputStream 안에 담기, Byte[] 형태로 리턴
		System.out.println("outSrc before: "+Arrays.toString(outSrc));
	}
}
