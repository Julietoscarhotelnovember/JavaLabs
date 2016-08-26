import java.util.Scanner;

class Account {
	String aname;
	int anum;
	int amount;
	Account(String aname, int anum, int amount) {
		this.aname=aname;
		this.anum=anum;
		this.amount=amount;
	}
	void showInfo() {
		System.out.println("������: "+this.aname+" ���¹�ȣ: "+this.anum+" �ܰ�: "+this.amount);
	}
}

class AtmMachine {
	int findAccount() {
		Scanner sc=new Scanner(System.in);
		System.out.print("���¹�ȣ�� �Է��ϼ���: ");
		int input=Integer.parseInt(sc.nextLine());
		return input;
	}
	void insertMoney(Account a, int amount) {
		System.out.println(a.anum+"���¿� "+amount+"�� �Ա��մϴ�.");
		a.amount+=amount;
	}
	void deleteMoney(Account a, int amount) {
		System.out.println(a.anum+"���¿��� "+amount+"�� ����մϴ�.");
		a.amount-=amount;
	}

	void transeMoney(Account a, Account b, int amount) {
				a.amount-=amount;
				b.amount+=amount;
				System.out.println(a.anum+"���¿��� "+b.anum+"���·� "+amount+"�� ��ü�˴ϴ�.");
	}
}

public class Atm {
	public static void main(String[] args) {
		AtmMachine atm=new AtmMachine();
		Account a1=new Account("��ȫ��", 111, 50000);
		Account a2=new Account("������", 222, 30000);
		Account a3=new Account("������", 333, 10000);
		Account a4=new Account("�̻��", 444, 100000);
		
		atm.insertMoney(a1, 5000);
		atm.deleteMoney(a2, 5000);
		atm.transeMoney(a3, a4, 3000);
		
		switch (atm.findAccount()) {
			case 111: a1.showInfo(); break;
			case 222: a2.showInfo(); break;
			case 333: a3.showInfo(); break;
			case 444: a4.showInfo(); break;
			default: System.out.println("FFFFFF"); break;
		}
		
		
	}
}
