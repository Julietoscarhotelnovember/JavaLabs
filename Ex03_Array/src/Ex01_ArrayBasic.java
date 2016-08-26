//배열은 객체다
public class Ex01_ArrayBasic {

	public static void main(String[] args) {
		int[] score=new int[3];
		System.out.println(score);
		//배열은 각각의 방을 가지고 있다
		//접근은 인덱스/첨자로 접근, 시작값은 0
		//항상 범위를 조심
		//배열개수(length)=배열마지막index+1
		for (int i=0; i<3; i++) {
			score[i]=i;
		}
		
		//System.out.println(score[3]);
		//java.lang.ArrayIndexOutOfBoundsException
		for (int i=0; i<3; i++) { //뭔가 쓰면 에러 안나게 할 수 있다 ->.length
			System.out.printf("score[%d]=%d\n",i,score[i]);
		}
		//사용자지정 배열은 기본적으로 array를 상속하기 때문에 .length 사용 가능
		for (int i=0; i<score.length; i++) { 
			System.out.printf("score[%d]=%d\n",i,score[i]);
		}
		
		//배열을 만드는 여러가지 방법들
		//선언과 할당을 분리할 수 있다
		int[] arr=new int[5]; //기본
		int[] arr2=new int[] {100, 200, 300, 400, 500}; //값으로 배열 만들기
		int[] arr3={11, 12, 13, 14, 15}; //바로 만들기, 컴파일러는 싫어한다
		
		for (int i=0; i<arr3.length; i++) {
			System.out.printf("arr3[%d]=%d\n",i,arr3[i]);
		}
		
		int[] arr4; //선언
		arr4=new int[]{1,2,3,4,5}; //할당
		
		int[] arr5={7,8,9,10};
		int[] arr6=arr5; //주소값 할당
		
		arr6[0]=888;
		System.out.println(arr5[0]);
		System.out.println(arr5==arr6);
		
		char[] ch=new char[10];
		for (int i=0; i<ch.length; i++) {
			System.out.println(">"+ch[i]+"<"); //char 기본값: 유니코드 \u0000
		}
	}

}
