package kr.or.kosta;

import java.util.ArrayList;

public class MyStack {
	Object[] data;

	public MyStack() {
		data = new Object[10];
	}

	int i = -1;

	public void Push(int a) {

			if (i > 10) {
				System.out.println("스택이 차서 더 넣을 수 없습니다");
			} else {	
				i++;
				data[i] = a;
			}
	}

	public void Pop() {

		if (i < 0) {
			System.out.println("스택이 비어있습니다");
		} else {
			System.out.println(data[i]);
			i--;
		}
	}
}