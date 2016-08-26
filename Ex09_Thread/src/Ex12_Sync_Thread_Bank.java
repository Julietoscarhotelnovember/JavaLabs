//���ü�, ���� �ٴ´� > ��Ƽ�ھ�, ����ó��
//������ �����鼭 ���� �۾��Ѵ� > ��Ƽ������

//������¿� ���� ���� ���ÿ� ��/��� ó���� �Ϸ��� �Ѵ�
class Account {
	int balance=1000;
	public synchronized void withDraw(int money) { //�޼ҵ� ����ȭ�� ���� ����
		System.out.println("��: "+Thread.currentThread().getName());
		System.out.println("���� �ܾ�: "+this.balance);
		if (balance >= money) {
			try {
				Thread.sleep(100); //ó���Ǵ� �����ð����� ����
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			balance-=money;
		}
		System.out.println("����ݾ�: "+money);
		System.out.println("���� �� �ܾ�: "+this.balance);
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
		
		//���ÿ� 3���� ���� ���¿� ���� ���ó��
		th.start();
		th2.start();
		th3.start();
		
	}
}
