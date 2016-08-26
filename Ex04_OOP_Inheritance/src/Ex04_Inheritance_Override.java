//상속관계에서 override 무조껀 상속에서 나오는 개념
//자식 클래스가 부모 클래스의 메소드를 재정의(내용바꾸기) 하는 것

//조건
//1.부모함수의 이름과 동일
//2.부모함수의 파라미터와 동일
//3.부모함수의 리턴타입과 동일
//->부모와 같아야 한다(부모함수의 {}안 내용만 바꾼다)
class Point2 extends Object {
	int x = 20;
	int y = 30;

	String getPosition() {
		return "x: " + this.x + " y: " + this.y;
	}
}

//부모의 getPosition()은 2가지 좌표 출력
//자식은 3가지 좌표를 출력해야 함
//부모가 가지는 getPosition을 재사용할 수 없을까? -> 오버라이드
class Point3D extends Point2 {
	int z = 40;

/*	String get3DPosition() {
		return "x: " + this.x + " y: " + this.y + " z: " + this.z;
	}*/
/*	String getPosition() {
		return "x: " + this.x + " y: " + this.y+ " z: " + this.z;
	}*/
	
	//우클릭-source-override로 생성
	@Override  //annotation->주석처리의 일종, 이클립스에서 강제 문법 체크(부모함수와 비교)
	String getPosition() {
		return "x: " + this.x + " y: " + this.y+ " z: " + this.z;
		//return super.getPosition();
	}
	
}

public class Ex04_Inheritance_Override {
	public static void main(String[] args) {
		Point3D p=new Point3D();
		//String result=p.get3DPosition();
		String result=p.getPosition();
		System.out.println(result);
	}
}
