class Car {
	int door;
	String color;
}

public class Ex06_Array2 {
	public static void main(String[] args) {
		// 2차원 배열
		int[][] score=new int[3][2];
		System.out.println(score[0][0]);
		/*score[0][0]=100;
		score[0][1]=200;
		score[1][0]=300;
		score[1][1]=400;
		score[2][0]=500;
		score[2][1]=600;*/
		int sum=100;
		for (int i=0; i<score.length; i++) { //.lengh로는 1차원의 길이만 나온다
			for (int j=0; j<score[i].length; j++) { //힌트: 행-열로 나누어진 배열 그림
				score[i][j]=sum;
				sum+=100;		
			}
		}
		for (int i=0; i<score.length; i++) { //.lengh로는 1차원의 길이만 나온다
			for (int j=0; j<score[i].length; j++) { //힌트: 행-열로 나누어진 배열 그림
				System.out.print(score[i][j]+" ");
			}
			System.out.println();
		}
		
		//다르게 배열만들기2
		int[][] score2=new int[][] { {1, 2},
									 {3, 4},
									 {5, 6} };
		for (int i=0; i<score2.length; i++) { //.lengh로는 1차원의 길이만 나온다
			for (int j=0; j<score2[i].length; j++) { //힌트: 행-열로 나누어진 배열 그림
				System.out.print(score2[i][j]+" ");
			}
			System.out.println();
		}
		
		//다르게 배열만들기3
		int[][] score3={ {10, 20},
			             {30, 40},
			             {50, 60} };
		
		//아주 중요한 for문, 개선된 for문
		//C#: for (type 변수명 in 배열or컬랙션) {출력}
		//자바: for (type 변수명 : 배열or컬랙션) {출력} 동적배열(행렬의 개수가 변화된다)->컬랙션
		int[] arr={5, 6, 7, 8, 9, 10};
		//일반 출력
		/*for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}*/
		//개선된 for문 출력
		for (int i: arr) { //컴파일러가 싫어합니다. 내부적으로 while문을 돌린다
						   //배열의 크기를 알 필요가 없다!
			System.out.print(" "+i); //i는 arr 내부"값"을 순차적으로 받아준다
		}
		
		String[] strarr={"가", "나", "다", "라"};
		for (String i: strarr) {
			System.out.print(" "+i);
		}
		
		//도전-2차원 행렬을 개선된 for문으로 출력하기????
		int[][] score4=new int[][] { {11, 12},
									 {13, 14},
									 {15, 16}};
		for (int[] i: score4) { //행에 대한 배열주소를 담고
			for (int j: i) {    //열을 출력
				System.out.println(j);
			}
		}
		
		//////////////////////////
		Car[] carArr=new Car[2];
		
		carArr[0]=new Car();
		carArr[0].color="gold";
		carArr[0].door=4;
		carArr[1]=new Car();
		carArr[1].color="red";
		carArr[1].door=2;
		
		for (int i=0; i<carArr.length; i++) {
			System.out.println(carArr[i].color+" "+carArr[i].door);
		}
		for (Car c:carArr) { //객체를 개선된 for문으로
			System.out.println(c.color+" "+c.door); //특이객체 배열 출력에 좋다
		}
		
		//다차원배열
		//행을 고정하고, 열을 제어한다
		int[][] arr4={{1, 2,}, {3, 4, 5}, {1}};
		for (int i=0; i<arr4.length; i++) { 
			for (int j=0; j<arr4[i].length; j++) { 
				System.out.print(arr4[i][j]+" ");
			}
			System.out.println();
		}
	}	
}
