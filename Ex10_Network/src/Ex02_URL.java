import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLConnection;

//자바 api 제공 클래스
//URL, URLConnection
//http://www.kangcom.com/company/history.asp
public class Ex02_URL {

	public static void main(String[] args) throws Exception {
		
		
		
		String urlStr="http://www.kangcom.com/company/history.asp";
		//String urlStr="http://image3.kangcom.com/2016/07/b_pic/201606302555.jpg";
		URL url=new URL(urlStr);
		FileInputStream fis=(FileInputStream)url.openStream();
		BufferedInputStream bis=new BufferedInputStream(fis);
		//FileOutputStream fos=new FileOutputStream("copy.jpg");
		FileOutputStream fos=new FileOutputStream("copy.html");
		
		byte[] buffer=new byte[2048];
		int n=0;
		int count=0;
		URLConnection uc=url.openConnection(); //정보를 보기 위해
		int filesize=uc.getContentLength();
		System.out.println("파일 크기: "+filesize);
		System.out.println("파일 형식: "+uc.getContentType());
		
		while ((n=bis.read(buffer))!=-1) {
			fos.write(buffer,0,buffer.length);
			fos.flush();
			System.out.println("n: "+n);
			count+=n;
		}
		System.out.println(count+"/ ");
		bis.close();
		fos.close();
	}
}
