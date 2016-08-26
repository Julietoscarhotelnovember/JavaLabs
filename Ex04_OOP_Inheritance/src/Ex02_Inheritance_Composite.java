//클래스가 여러 개 있는 경우 어떻게 관계를 맺어 줄 것인가?
//상속: is~a
//포함: has~a

//원은 도형이다 (is~a)
//원은 점을 가지고 있다 (has~a)

//원, 삼각형, 사각형을 만들어보았더니
//공통적으로 색상이 있고, 그리다라는 기능이 있더라
//도형: 색상, 그리다
//is~a 관계 성립
class Shape {
	String color = "red";

	void draw() {
		System.out.println("그리다");
	}
}

// point(class) -> has~a
class Point {
	int x = 1;
	int y = 1;

	Point() {
		/*
		 * this.x=1; this.y=1;
		 */
		this(1, 1); // 멋진
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

}

class Circle extends Shape {
	int r; // 원의 특수성
	// 공통사항->포함
	Point center; // Point 클래스가 Circle의 멤버변수로 들어옴
					// 이중상속이 아니라

	Circle() {
		/*
		 * this.r=100; //this.center=new Point(); this.center=new Point(10, 10);
		 */
		this(100, new Point(10, 10)); // 이거 정말 어렵다
	}

	// 중요한 예제라고 합니다, 지속적 복습이 필요하다 Point 넣는 것 때문에
	Circle(int r, Point center) {
		this.r = r;
		this.center = center; // 포함관계는 객체 생성 후 줘야한다
	}

	void circleDraw() {
		System.out.println("원그리기");
		System.out.println("반지름: " + this.r);
		System.out.println("x: " + this.center.x);
		System.out.println("y: " + this.center.y);
	}
}

// 문제: 삼각형 만들기
// 조건: 삼각형은 도형이다. 삼각형은 3개의 점을 가지고 있다.
// 힌트: (x, y), (x, y), (x, y)를 이으면 삼각형
// 힌트: 점 3개를 하나의 변수로 사용하는 방법은 배열

// 1단계 코드
// 고정된 삼각형만 그려진다
// 해결: 좌표값 3개를 객체를 만들때 받기 -> 고정크기, 변동크기 필요
/*
 * class Triangle extends Shape { Point p1=new Point(10, 20); Point p2=new
 * Point(30, 50); Point p3=new Point(60, 80); void triangleDraw() {
 * System.out.print("삼각형을 "); draw(); System.out.println("색상: "+this.color);
 * System.out.println("좌표1: "+p1.x+", "+p1.y);
 * System.out.println("좌표2: "+p2.x+", "+p2.y);
 * System.out.println("좌표3: "+p3.x+", "+p3.y); } }
 */

// 2단계 코드
class Triangle extends Shape {
	Point[] pointarray;

	Triangle() {
		pointarray = new Point[3];
		pointarray[0] = new Point(10, 20);
		pointarray[1] = new Point(30, 50);
		pointarray[2] = new Point(60, 80);
	}

	Triangle(Point[] point) {
		this.pointarray = point;
	}

	void triangleDraw() {
		System.out.print("삼각형을 ");
		draw();
		System.out.println("색상: " + this.color);
		for (Point po : pointarray) {
			System.out.printf("좌표: %d, %d\n", po.x, po.y);
		}
	}
}

// 상속은 일반화 -> 구체화
// 상속은 공통사항 -> 특수화
// 일반: Shape, Point
// 특수: Circle(반지름), Triangle(점3개)

public class Ex02_Inheritance_Composite {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.circleDraw();

		// 내가 원하는 r, x, y를 가지는 원을 그리고 싶다
		Point p = new Point(150, 100);
		Circle c2 = new Circle(50, p);
		c2.circleDraw();
		c2.draw();

		// 삼각형
		// 1단계
		Triangle t = new Triangle();
		t.triangleDraw();

		// 2단계
		Point[] p2 = { new Point(10, 20), new Point(30, 40), new Point(50, 60) };
		Triangle t2 = new Triangle(p2);
		t2.triangleDraw();
	}
}
