import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//대상: file
//file을 대상으로 read, write
//FileInputStream
//FileOutputStream
//c:\Temp 폴더를 대상으로 작업

public class Ex03_Stream_File {

	public static void main(String[] args) {
	/*	1단계 코드
	   try {
			FileInputStream fs=new FileInputStream("c:\\Temp\\file.txt"); //예외 던지기 발생
			//공식 또나옴 
			int data=0;
			while ((data=fs.read())!=-1) {
				char c=(char)data; //string->int->string 변환
				System.out.println(data+" = "+c);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}*/
		
		FileInputStream fis=null;
		FileOutputStream fos=null;
		String path="c:\\Temp\\file.txt";
		
		try {
			fis=new FileInputStream(path);
			//fos=new FileOutputStream("c:\\Temp\\new.txt"); //new.txt 가 없으면 생성 후 쓰기
			fos=new FileOutputStream("c:\\Temp\\new.txt", true); //기본 false 덮어쓰기, true 이어쓰기
			int data=0;
			while ((data=fis.read())!=-1) {
				fos.write(data); //아스키코드로 들어가서 변환 안해도 된다
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			//IO 자원은 GC의 관리 대상이 아니다 -> 명시적으로 자원해제를 해 주는 것이 좋다
			//IO에서 문제가 많이 발생해서 대부분 예외처리를 해야 한다.
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			} 
		}
	}
}
