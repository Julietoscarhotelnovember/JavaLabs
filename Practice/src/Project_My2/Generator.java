//한종->상원
//all_log.dat 파일 생성
//기존 all_log.dat 파일 삭제, DataMain의 생성자 삭제 후 돌리기

package Project_My2;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Generator {

	public static void main(String[] args) throws IOException {
		Data.personlist.add(new Person("조장현", "1234", true, "서울", 25));
		Data.personlist.add(new Person("성홍모", "1234", true, "서울", 26));
		Data.personlist.add(new Person("이상원", "1234", true, "경기", 31));
		Data.personlist.add(new Person("길한종", "1234", true, "경기", 32));
		Data.personlist.add(new Person("임경균", "1234", true, "서울", 30));
		Data.personlist.add(new Person("김지현", "1234", false, "경기", 25));
		Data.personlist.add(new Person("박지은", "1234", false, "경기", 29));
		Data.personlist.add(new Person("백승아", "1234", false, "경기", 24));
		Data.personlist.add(new Person("박신혜", "1234", false, "서울", 27));
		Data.personlist.add(new Person("김태희", "1234", false, "서울", 50));
		Data.personlist.add(new Person("하재현", "1234", false, "경기", 19));
		Data.personlist.add(new Person("공유", "1234", true, "경기", 19));
		SaveAll();
		System.out.println("all_log.dat 파일이 생성 되었습니다.");
	}
	
	public static void SaveAll() throws IOException {

	      FileOutputStream fos = new FileOutputStream("all_log.dat");
	      BufferedOutputStream bos = new BufferedOutputStream(fos);
	      ObjectOutputStream out = new ObjectOutputStream(bos);

	      out.writeObject(Data.personlist);

	      out.close();
	      bos.close();
	      fos.close();
	   }
}
