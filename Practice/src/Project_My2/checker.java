package Project_My2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class checkPassword {
	//��й�ȣ �˻�
	checkPassword(String pw) {
		String regex = "^[a-zA-Z0-9]{7}$";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(pw);
		boolean b = m.matches();
		while (b==false) {
			System.out.println("��й�ȣ�� �ٽ� �Է��ϼ���: ");
			pw = sc.next();
			m=p.matcher(pw);
			b = m.matches();
		}
	}
}
