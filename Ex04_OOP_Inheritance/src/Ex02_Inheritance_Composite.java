//Ŭ������ ���� �� �ִ� ��� ��� ���踦 �ξ� �� ���ΰ�?
//���: is~a
//����: has~a

//���� �����̴� (is~a)
//���� ���� ������ �ִ� (has~a)

//��, �ﰢ��, �簢���� �����Ҵ���
//���������� ������ �ְ�, �׸��ٶ�� ����� �ִ���
//����: ����, �׸���
//is~a ���� ����
class Shape {
	String color = "red";

	void draw() {
		System.out.println("�׸���");
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
		this(1, 1); // ����
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

}

class Circle extends Shape {
	int r; // ���� Ư����
	// �������->����
	Point center; // Point Ŭ������ Circle�� ��������� ����
					// ���߻���� �ƴ϶�

	Circle() {
		/*
		 * this.r=100; //this.center=new Point(); this.center=new Point(10, 10);
		 */
		this(100, new Point(10, 10)); // �̰� ���� ��ƴ�
	}

	// �߿��� ������� �մϴ�, ������ ������ �ʿ��ϴ� Point �ִ� �� ������
	Circle(int r, Point center) {
		this.r = r;
		this.center = center; // ���԰���� ��ü ���� �� ����Ѵ�
	}

	void circleDraw() {
		System.out.println("���׸���");
		System.out.println("������: " + this.r);
		System.out.println("x: " + this.center.x);
		System.out.println("y: " + this.center.y);
	}
}

// ����: �ﰢ�� �����
// ����: �ﰢ���� �����̴�. �ﰢ���� 3���� ���� ������ �ִ�.
// ��Ʈ: (x, y), (x, y), (x, y)�� ������ �ﰢ��
// ��Ʈ: �� 3���� �ϳ��� ������ ����ϴ� ����� �迭

// 1�ܰ� �ڵ�
// ������ �ﰢ���� �׷�����
// �ذ�: ��ǥ�� 3���� ��ü�� ���鶧 �ޱ� -> ����ũ��, ����ũ�� �ʿ�
/*
 * class Triangle extends Shape { Point p1=new Point(10, 20); Point p2=new
 * Point(30, 50); Point p3=new Point(60, 80); void triangleDraw() {
 * System.out.print("�ﰢ���� "); draw(); System.out.println("����: "+this.color);
 * System.out.println("��ǥ1: "+p1.x+", "+p1.y);
 * System.out.println("��ǥ2: "+p2.x+", "+p2.y);
 * System.out.println("��ǥ3: "+p3.x+", "+p3.y); } }
 */

// 2�ܰ� �ڵ�
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
		System.out.print("�ﰢ���� ");
		draw();
		System.out.println("����: " + this.color);
		for (Point po : pointarray) {
			System.out.printf("��ǥ: %d, %d\n", po.x, po.y);
		}
	}
}

// ����� �Ϲ�ȭ -> ��üȭ
// ����� ������� -> Ư��ȭ
// �Ϲ�: Shape, Point
// Ư��: Circle(������), Triangle(��3��)

public class Ex02_Inheritance_Composite {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.circleDraw();

		// ���� ���ϴ� r, x, y�� ������ ���� �׸��� �ʹ�
		Point p = new Point(150, 100);
		Circle c2 = new Circle(50, p);
		c2.circleDraw();
		c2.draw();

		// �ﰢ��
		// 1�ܰ�
		Triangle t = new Triangle();
		t.triangleDraw();

		// 2�ܰ�
		Point[] p2 = { new Point(10, 20), new Point(30, 40), new Point(50, 60) };
		Triangle t2 = new Triangle(p2);
		t2.triangleDraw();
	}
}
