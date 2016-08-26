package Bogang1;

public class StudentScore extends StudentInfo {
    int kor;
    int eng;
    int math;
    int sum;
    float avg;//
    
    public StudentScore (int num, String name, String gwa, int kor, int eng, int math){
        
        super(num, name, gwa);
        this.kor = kor;
        this.eng = eng;
        this.math = math; 
    
    
        
    }
    public int SumScore(){
        
        this.sum = (kor+eng+math);
        return sum;
    }
    public float AvgScore(){
         float avg= (float)this.sum/3;
        return avg;
    }
    public void StudentScore(){
        super.Studentinfo();
        System.out.println("±¹¾î :"+
                this.kor+"¿µ¾î :"
                +this.eng+"¼öÇÐ :"
                +this.math+"ÃÑÇÕ :"+SumScore()+" Æò±Õ :"+AvgScore()
                );
    }
}
