//객체지향언어의 대표적인 개념: Method Overloading
//하나의 메소드 이름으로 여러 가지 기능을 하도록 한다
//조건
//1.함수의 이름을 같게
//2.parameter의 개수와 type을 다르게
//3.return type은 overloading 판단 기준이 될 수 없음
//4.parameter의 순서를 다르게

//장점은 무엇인가? 개발자 입장에서 편해서
//하나의 함수 이름으로 여러가지 기능을 쓸 수 있어서
//오버로드 사용 시 성능차이 없음
class OverTest {
	int add(int i) {
		return i+100;
	}
	int add(int i, int j) {
		return i+j;
	}
	int[] add(int[] param) { //param이 받는것은 배열의 주소값
		int[] target=new int[param.length];
		for (int i=0; i<param.length; i++) {
			target[i]=param[i]+1;
		}
		return target;
	}
	int[] add(int[] so, int[] so2) {
		int[] arr=new int[so.length];
		for (int i=0; i<so.length; i++) {
			arr[i]=so[i]+so2[i];
		}
		return arr;
	}
	
/* 이런건 안됨	
	void add(int i) {
		return i+200;
	}
*/	
	void add(int i, String s) {
		//인정
	}
	void add(String s, int i) {
		//인정
	}
}

public class Ex11_Method_Overloading {

	public static void main(String[] args) {
		OverTest ot=new OverTest();
		int result=ot.add(100, 200);
		System.out.println(result);
		result=ot.add(50);
		System.out.println(result);
		
		//처음부터 사용했던 오버로딩 함수
		//System.out.println();
		//많이 쓰면서 공통 기능인 것에 대해
		
		//배열을 배운 후 오버로딩 적용하기	
		int[] source=new int[]{10,20,30};
		int[] target2=ot.add(source);
		for (int value:target2) {
			System.out.println(value);
		}
		
		int[] source2=new int[]{100,200,300};
		int[] source3=new int[]{400,500,600};
		int[] target3=ot.add(source2, source3);
		for (int value:target3) {
			System.out.println(value);
		}
		

	}
}
