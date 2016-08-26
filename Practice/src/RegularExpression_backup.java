/*import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
class JuminChecker {
    String jumin = "^(?:[0-9]{2}(?:0[1-9]|1[0-2])(?:0[1-9]|[1,2][0-9]|3[0,1]))-[1-8][0-9]{6}$";
    String input;
    ArrayList<Integer> array = new ArrayList<Integer>();
 
    void insertNum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("주민번호를 입력하세요: ");
        input = sc.nextLine();
        String input2 = input.replace("-", "");
        for (int i = 0; i < input2.length(); i++) {
            array.add(Integer.parseInt(input2.substring(i, i + 1)));
            System.out.println(array.get(i));
        }
    }
 
    void Check() {
        Pattern p = Pattern.compile(jumin);
        Matcher m = p.matcher(input);
        boolean b = m.matches();
        int parity = (11 - ((array.get(0) * 2 + array.get(1) * 3 + array.get(2) * 4 + array.get(3) * 5
                + array.get(4) * 6 + array.get(5) * 7 + array.get(6) * 8 + array.get(7) * 9 + array.get(8) * 2
                + array.get(9) * 3 + array.get(10) * 4 + array.get(11) * 5) % 11)) % 10;
        if (b == true) {
            if (parity == array.get(12)) {
                System.out.println("맞는 주민번호 입니다.");
            } else {
                System.out.println("틀린 주민번호 입니다.");
            }
        } else {
            System.out.println("틀린 주민번호 입니다.");
        }
    }
}
 
public class RegularExpression_backup {
    public static void main(String[] args) {
        JuminChecker j = new JuminChecker();
        j.insertNum();
        j.Check();
    }
}
*/