package Project_My2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class checkPassword {
	//비밀번호 검사
	checkPassword(String pw) {
		String regex = "^[a-zA-Z0-9]{7}$";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(pw);
		boolean b = m.matches();
		while (b==false) {
			System.out.println("비밀번호를 다시 입력하세요: ");
			pw = sc.next();
			m=p.matcher(pw);
			b = m.matches();
		}
	}
}
