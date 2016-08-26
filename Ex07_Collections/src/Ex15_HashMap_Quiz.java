import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex15_HashMap_Quiz {

	public static void main(String[] args) {
		//회원로그인 처리
		
		HashMap loginmap=new HashMap();
		
		//가입된 회원ID, pass
		loginmap.put("kim", "kim1004");
		loginmap.put("scott", "tiger");
		
		//인증관련 처리
		//ID, pass 입력받기
		Scanner sc=new Scanner(System.in);
		System.out.print("ID 입력: ");
		String id=sc.nextLine();
		
		//실제 회원인지 인증여부 판단
		while (true) {
			if (loginmap.containsKey(id)) {
				// passwd
				System.out.print("pass 입력: ");
				String pass = sc.nextLine();
				if (loginmap.containsValue(pass)) {
					System.out.println("로그인됨");
					break;
				} else {
					System.out.println("ㄴㄴ");
				}
			}
		}
			
	}
}
