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
		System.out.println("재생");
	}

	void Stop() {
		System.out.println("정지");
	}

	void Rew() {
		System.out.println("앞으로 감기");
	}

	void Ff() {
		System.out.println("뒤로 감기");
	}
}

//VCR기능을 가지는 TV를 만들자
//VCR, TV가 공통기능
//그렇다면, TV를 상속받고, VCR을 포함
//선택기준-비중이 높은 것을 상속한다

class TvVcr extends Tv {
	Vcr vcr=new Vcr();
}

public class Ex03_Single_Inheritance {
	public static void main(String[] args) {
		
		TvVcr t=new TvVcr();
		t.Power();
		System.out.println("TV 전원: "+t.power);
		t.Chup();
		System.out.println("TV 채널: "+t.ch);
		
		t.vcr.Power();
		System.out.println("비디오 전원: "+t.vcr.power);
		t.vcr.Play();
		t.vcr.Stop();
		t.vcr.Power();
		System.out.println("비디오 전원: "+t.vcr.power);
		t.Power();
		System.out.println("TV 전원: "+t.power);
	}
}