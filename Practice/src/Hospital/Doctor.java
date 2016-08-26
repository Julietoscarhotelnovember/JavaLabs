package Hospital;

public class Doctor extends Person implements Readable {
    Doctor(String name, int age) {
        this.name=name;
        this.age=age;
    }
    @Override
    void act() {
        System.out.println("의사는 환자를 진료한다.");
    }
}