//��Ӱ��迡�� override ������ ��ӿ��� ������ ����
//�ڽ� Ŭ������ �θ� Ŭ������ �޼ҵ带 ������(����ٲٱ�) �ϴ� ��

//����
//1.�θ��Լ��� �̸��� ����
//2.�θ��Լ��� �Ķ���Ϳ� ����
//3.�θ��Լ��� ����Ÿ�԰� ����
//->�θ�� ���ƾ� �Ѵ�(�θ��Լ��� {}�� ���븸 �ٲ۴�)
class Point2 extends Object {
	int x = 20;
	int y = 30;

	String getPosition() {
		return "x: " + this.x + " y: " + this.y;
	}
}

//�θ��� getPosition()�� 2���� ��ǥ ���
//�ڽ��� 3���� ��ǥ�� ����ؾ� ��
//�θ� ������ getPosition�� ������ �� ������? -> �������̵�
class Point3D extends Point2 {
	int z = 40;

/*	String get3DPosition() {
		return "x: " + this.x + " y: " + this.y + " z: " + this.z;
	}*/
/*	String getPosition() {
		return "x: " + this.x + " y: " + this.y+ " z: " + this.z;
	}*/
	
	//��Ŭ��-source-override�� ����
	@Override  //annotation->�ּ�ó���� ����, ��Ŭ�������� ���� ���� üũ(�θ��Լ��� ��)
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
