package Hospital;
 
public class Main {
 
    public static void main(String[] args) {
        Data[] data={new Data(1, "의사 진찰1", "간호사 진료1"), new Data(2, "의사 진료 없음", "간호사 진료2"), new Data(3, "의사 진료2", "간호사 진료 없음")};
        Doctor doctor=new Doctor("의사", 50);
        Nurse nurse=new Nurse("간호사", 30);
        Patient patient=new Patient("환자", 25);
        
        for (Data d:data) {
            System.out.println("의사 진료 기록");
            d.display(doctor);
            System.out.println("---------");
        }
        for (Data d:data) {
            System.out.println("간호사 진료 기록");
            d.display(nurse);
            System.out.println("----------");
        }
        for (Data d:data) {
            System.out.println("환자 기록");
            d.display(patient);
            System.out.println("---------");
        }
    }
}