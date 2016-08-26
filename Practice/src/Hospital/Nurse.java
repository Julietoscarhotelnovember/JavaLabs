package Hospital;

public class Nurse extends Person implements Readable {
    Nurse(String name, int age) {
        this.name=name;
        this.age=age;
    }
    @Override
    void act() {
        System.out.println("간호사는 환자를 돌본다.");
    }   
}