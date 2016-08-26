package Bogang1;

public class StudentInfo {
    private int num;
    private String name;
    private String gwa;
   
   public StudentInfo(int num, String name, String gwa){
       
       this.num = num;
       this.name = name;
       this.gwa = gwa;
   
   }
   

   public void Studentinfo(){
       System.out.println("학번 :"+ this.num+ "이름 :"+this.name+"학과 :"+this.gwa);
   }
}

