import java.io.File;

//File 클래스
//파일과 폴더를 다룬다
//MS는 File, Directory로 나누어 놓았다

//새로운 파일/폴더를 생성, 삭제, 수정
//웹 상에서는 월별 파일 업로드 등에 쓰인다


public class Ex08_File {
	public static void main(String[] args) {
		String path="c:\\Temp\\aaa\\aaa.txt";
		File f=new File(path);
		
		//File 클래스로 정보 추출 할 수 있다
		String filename=f.getName();
		System.out.println(filename);
		
		//파일의 이름, 확장자 가져오기
		//split substrign?
		int pos=filename.indexOf(".");
		System.out.println("파일명: "+filename.substring(0, pos));
		System.out.println("확장자: "+filename.substring(++pos));
		
		//File 클래스가 가지고 있는 함수
		System.out.println("전체경로: "+f.getPath());
		//System.out.println("절대경로: "+f.getAbsolutePath());
		System.out.println("폴더니? "+f.isDirectory());
		System.out.println("파일E니? "+f.isFile());
		System.out.println("파일 크기: "+f.length()+"byte");
		System.out.println("부모경로: "+f.getParent()); //파일을 제외한 윗경로 보기
		System.out.println("파일의 물리적 존재 여부: "+f.exists());
		
		
	}
}
