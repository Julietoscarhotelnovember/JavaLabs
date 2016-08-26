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
		System.out.println("예금주: "+this.aname+" 계좌번호: "+this.anum+" 잔고: "+this.amount);
	}
}

class AtmMachine {
	int findAccount() {
		Scanner sc=new Scanner(System.in);
		System.out.print("계좌번호를 입력하세요: ");
		int input=Integer.parseInt(sc.nextLine());
		return input;
	}
	void insertMoney(Account a, int amount) {
		System.out.println(a.anum+"계좌에 "+amount+"를 입금합니다.");
		a.amount+=amount;
	}
	void deleteMoney(Account a, int amount) {
		System.out.println(a.anum+"계좌에서 "+amount+"를 출금합니다.");
		a.amount-=amount;
	}

	void transeMoney(Account a, Account b, int amount) {
				a.amount-=amount;
				b.amount+=amount;
				System.out.println(a.anum+"계좌에서 "+b.anum+"계좌로 "+amount+"가 이체됩니다.");
	}
}

public class Atm {
	public static void main(String[] args) {
		AtmMachine atm=new AtmMachine();
		Account a1=new Account("성홍모", 111, 50000);
		Account a2=new Account("조장현", 222, 30000);
		Account a3=new Account("길한종", 333, 10000);
		Account a4=new Account("이상원", 444, 100000);
		
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
