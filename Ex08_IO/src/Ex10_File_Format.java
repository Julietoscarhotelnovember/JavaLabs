import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex10_File_Format {
	public static void main(String[] args) {
		File dir=new File("c:\\Temp");
		File[] files=dir.listFiles();
		for (int i=0; i<files.length; i++) {
			File file=files[i];
			String name=file.getName();
			//System.out.println(name);
			
			//포맷팅 해주는 클래스
			SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd a hh:mm"); //날짜를 이쁘게
			String attribute="";
			String size="";
			if (files[i].isDirectory()) {
				attribute="<DIR>";
			} else {
				attribute+=file.canRead() ? "R":"";
				attribute+=file.canWrite() ? "W":"";
				attribute+=file.isHidden() ? "H":"";
				size=file.length()+"Byte";
			}
			System.out.printf("%s %3s %10s %s\n", df.format(new Date(file.lastModified())), attribute, size, name);
		}
	}

}
