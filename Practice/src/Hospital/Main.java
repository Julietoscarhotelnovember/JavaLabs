package Hospital;
 
public class Main {
 
    public static void main(String[] args) {
        Data[] data={new Data(1, "�ǻ� ����1", "��ȣ�� ����1"), new Data(2, "�ǻ� ���� ����", "��ȣ�� ����2"), new Data(3, "�ǻ� ����2", "��ȣ�� ���� ����")};
        Doctor doctor=new Doctor("�ǻ�", 50);
        Nurse nurse=new Nurse("��ȣ��", 30);
        Patient patient=new Patient("ȯ��", 25);
        
        for (Data d:data) {
            System.out.println("�ǻ� ���� ���");
            d.display(doctor);
            System.out.println("---------");
        }
        for (Data d:data) {
            System.out.println("��ȣ�� ���� ���");
            d.display(nurse);
            System.out.println("----------");
        }
        for (Data d:data) {
            System.out.println("ȯ�� ���");
            d.display(patient);
            System.out.println("---------");
        }
    }
}