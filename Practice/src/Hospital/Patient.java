package Hospital;
 
public class Patient extends Person implements Readable {
    Patient(String name, int age) {
        this.name=name;
        this.age=age;
    }
    @Override
    void act() {
        System.out.println("ȯ�ڴ� ���ǿ� �����ִ�.");
    }    
}