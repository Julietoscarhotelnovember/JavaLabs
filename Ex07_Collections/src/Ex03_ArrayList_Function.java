import java.util.ArrayList;

public class Ex03_ArrayList_Function {

	public static void main(String[] args) {
		ArrayList list1=new ArrayList();
		ArrayList list2=new ArrayList();
		list1.add(1); list1.add(2); list1.add(3); list1.add(4);
		list2.add(3); list2.add(4); list2.add(5); list2.add(6);
		System.out.println("list1: "+list1.toString());
		System.out.println("list2: "+list2.toString());
		
		//교집합
		ArrayList kyo=new ArrayList();
		kyo.addAll(list1); //list1안의 배열값을 kyo에 전부 넣어라
		kyo.retainAll(list2); //kyo에 list2와 같은값만 남겨라
		System.out.println("교집합: "+kyo.toString());
		
		//차집합
		ArrayList cha=new ArrayList();
		cha.addAll(list1);
		cha.removeAll(list2);
		System.out.println("차집합: "+cha.toString());
		
		//합집합
		ArrayList hap=new ArrayList();
		hap.addAll(list1);
		hap.removeAll(kyo); //순서 주의, 수학의 합집합 구하는 것과 다르다
		hap.addAll(list2);
		System.out.println("합집합: "+hap.toString());
		
	}
}
