import java.util.Stack;

import kr.or.kosta.MyStack;

public class Ex07_Stack {

	public static void main(String[] args)  {
		Stack stack=new Stack();
		stack.push(100);  //add�� ���� ����
		stack.push(200);
		stack.push(300);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		//System.out.println(stack.pop());
		
		//���� ���� Ŭ���� ������
		System.out.println("=========���� ����=========");
		MyStack mystack=new MyStack();
		mystack.Push(500);
		mystack.Push(600);
		mystack.Push(700);
		mystack.Push(700);
		mystack.Push(700);
		mystack.Push(700);
		mystack.Push(700);
		mystack.Push(1000);

		mystack.Pop();
		mystack.Pop();
		mystack.Pop();
		mystack.Pop();

	}
}
