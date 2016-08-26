import java.lang.reflect.Array;
import java.util.Arrays;

//Deep Copy 새로운 객체 이용
//Shallow Copy 같은 객체의 주소값 이용
public class Ex06_Array_Copy {

	public static void main(String[] args) {
		int[] data={1,2,3,4,5};
		int[] data2={6,7,8,9,10};
		int[] scopy=null;
		int[] dcopy=null;
		
		System.out.println("적용");
		scopy=shallowCopy(data);
		System.out.println(Arrays.toString(scopy));
		System.out.println(Arrays.toString(data));
		System.out.println(scopy==data);
		
		dcopy=deepCopy(data2);
		System.out.println(dcopy==data2);
		
	}
	static int[] shallowCopy(int[] arr) {
		return arr;
	}
	static int[] deepCopy(int[] arr) {
		int[] resultArray=new int[arr.length];
		System.arraycopy(arr, 0, resultArray, 0, arr.length);  //배열 범위 복사 함수
		/*for (int i=0; i<arr.length; i++) { 이것과 같은 의미
			resultArray[i]=arr[i];
		}*/
		return resultArray;
	}
}
