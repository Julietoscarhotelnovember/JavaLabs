//동시성, 같이 붙는다 > 멀티코어, 병렬처리
//들어오고 나가면서 같이 작업한다 > 멀티스레드

//은행계좌에 여러 명이 동시에 입/출금 처리를 하려고 한다
class Account {
	int balance=1000;
	public synchronized void withDraw(int money) { //메소드 동기화가 가장 쉽다
		System.out.println("고객: "+Thread.currentThread().getName());
		System.out.println("현재 잔액: "+this.balance);
		if (balance >= money) {
			try {
				Thread.sleep(100); //처리되는 업무시간으로 가정
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			balance-=money;
		}
		System.out.println("인출금액: "+money);
		System.out.println("인출 후 잔액: "+this.balance);
	}
}
class Bank implements Runnable {
	Account acc=new Account();
	@Override
	public void run(){
		while (acc.balance>0) {
			int money=((int)Math.random()*3+1)*100;
			acc.withDraw(money);
		}
	}
}
public class Ex12_Sync_Thread_Bank {
	public static void main(String[] args) {
		Bank bank=new Bank();
		Thread th=new Thread(bank, "park");
		Thread th2=new Thread(bank, "kim");
		Thread th3=new Thread(bank, "lee");
		
		//동시에 3명이 같은 계좌에 대해 출금처리
		th.start();
		th2.start();
		th3.start();
		
	}
}
