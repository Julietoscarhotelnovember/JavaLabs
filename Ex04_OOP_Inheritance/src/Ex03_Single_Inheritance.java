class Tv {
	boolean power;
	int ch;

	void Power() {
		this.power = !this.power;
	}

	void Chup() {
		ch++;
	}

	void Chdown() {
		ch--;
	}
}

class Vcr {
	boolean power;
	int counter = 0;

	void Power() {
		this.power = !this.power;
	}

	void Play() {
		System.out.println("���");
	}

	void Stop() {
		System.out.println("����");
	}

	void Rew() {
		System.out.println("������ ����");
	}

	void Ff() {
		System.out.println("�ڷ� ����");
	}
}

//VCR����� ������ TV�� ������
//VCR, TV�� ������
//�׷��ٸ�, TV�� ��ӹް�, VCR�� ����
//���ñ���-������ ���� ���� ����Ѵ�

class TvVcr extends Tv {
	Vcr vcr=new Vcr();
}

public class Ex03_Single_Inheritance {
	public static void main(String[] args) {
		
		TvVcr t=new TvVcr();
		t.Power();
		System.out.println("TV ����: "+t.power);
		t.Chup();
		System.out.println("TV ä��: "+t.ch);
		
		t.vcr.Power();
		System.out.println("���� ����: "+t.vcr.power);
		t.vcr.Play();
		t.vcr.Stop();
		t.vcr.Power();
		System.out.println("���� ����: "+t.vcr.power);
		t.Power();
		System.out.println("TV ����: "+t.power);
	}
}