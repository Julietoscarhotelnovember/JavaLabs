package Project_My2;

import java.util.Calendar;

public class Company_Data {
   public static String DateString(Calendar date) {
      return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월 " + date.get(Calendar.DATE)
            + "일" + date.get(Calendar.HOUR) + "시" + date.get(Calendar.MINUTE) + "분";
   }

}