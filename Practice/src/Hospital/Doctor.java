package Hospital;

public class Doctor extends Person implements Readable {
    Doctor(String name, int age) {
        this.name=name;
        this.age=age;
    }
    @Override
    void act() {
        System.out.println("�ǻ�� ȯ�ڸ� �����Ѵ�.");
    }
}