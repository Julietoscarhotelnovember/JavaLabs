//�迭�� ��ü��
public class Ex01_ArrayBasic {

	public static void main(String[] args) {
		int[] score=new int[3];
		System.out.println(score);
		//�迭�� ������ ���� ������ �ִ�
		//������ �ε���/÷�ڷ� ����, ���۰��� 0
		//�׻� ������ ����
		//�迭����(length)=�迭������index+1
		for (int i=0; i<3; i++) {
			score[i]=i;
		}
		
		//System.out.println(score[3]);
		//java.lang.ArrayIndexOutOfBoundsException
		for (int i=0; i<3; i++) { //���� ���� ���� �ȳ��� �� �� �ִ� ->.length
			System.out.printf("score[%d]=%d\n",i,score[i]);
		}
		//��������� �迭�� �⺻������ array�� ����ϱ� ������ .length ��� ����
		for (int i=0; i<score.length; i++) { 
			System.out.printf("score[%d]=%d\n",i,score[i]);
		}
		
		//�迭�� ����� �������� �����
		//����� �Ҵ��� �и��� �� �ִ�
		int[] arr=new int[5]; //�⺻
		int[] arr2=new int[] {100, 200, 300, 400, 500}; //������ �迭 �����
		int[] arr3={11, 12, 13, 14, 15}; //�ٷ� �����, �����Ϸ��� �Ⱦ��Ѵ�
		
		for (int i=0; i<arr3.length; i++) {
			System.out.printf("arr3[%d]=%d\n",i,arr3[i]);
		}
		
		int[] arr4; //����
		arr4=new int[]{1,2,3,4,5}; //�Ҵ�
		
		int[] arr5={7,8,9,10};
		int[] arr6=arr5; //�ּҰ� �Ҵ�
		
		arr6[0]=888;
		System.out.println(arr5[0]);
		System.out.println(arr5==arr6);
		
		char[] ch=new char[10];
		for (int i=0; i<ch.length; i++) {
			System.out.println(">"+ch[i]+"<"); //char �⺻��: �����ڵ� \u0000
		}
	}

}
