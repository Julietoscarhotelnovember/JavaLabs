package Project_My2;

import java.util.Calendar;

public class Company_Data {
   public static String DateString(Calendar date) {
      return date.get(Calendar.YEAR) + "�� " + (date.get(Calendar.MONTH) + 1) + "�� " + date.get(Calendar.DATE)
            + "��" + date.get(Calendar.HOUR) + "��" + date.get(Calendar.MINUTE) + "��";
   }

}