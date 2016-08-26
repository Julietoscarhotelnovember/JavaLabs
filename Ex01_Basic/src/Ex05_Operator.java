
public class Ex05_Operator {

	public static void main(String[] args) {
		//연산자
		int sum=0; //지역변수 (초기화)
		//sum=sum+1;
		//줄임표현 +=, -=, *=
		sum+=1;
		sum-=1;
		
		//학점 계산기
		//이상, 이하, 초과, 미만
		
		//시나리오: 학점이 90 이상이라면 A
		//            90 이상 95이상이면 A+
		//			  95 이상이 아닌 나머지는 A-
		//그럼 A0는요????
		int score=84;
		String grade="";
		System.out.println("니 점수는: " + score);
		if (score>=90){
			grade="A";
			if (score>=95){
				grade+="+"; //이게 중요!
			}else{
				grade+="-";
			}
		}else if(score>=80){
			grade="B";
			if (score>=85){
				grade+="+"; //이게 중요!
			}else{
				grade+="-";
			}
		}else if(score>=70){
			grade="C";
			if (score>=75){
				grade+="+"; //이게 중요!
			}else{
				grade+="-";
			}
		}else{
			grade="F";
		}
		System.out.println("니 학점은: " + grade);
	}
}

