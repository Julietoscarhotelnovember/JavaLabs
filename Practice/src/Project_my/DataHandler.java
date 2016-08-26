package Project_my;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class DataHandler {
	ArrayList<Man> arrayman=new ArrayList<Man>();
	ArrayList<Woman> arraywoman=new ArrayList<Woman>();
	void intsertPerson(Person p) {
		if (p instanceof Man) {
			arrayman.add((Man) p);
		} else {
			arraywoman.add((Woman) p);
		}
	}
	void matchPerson(Woman w) {
		int age=0;
		int live=0;
		String id="";
		boolean gender=true;
		for (int i=0; i<arrayman.size(); i++) {
			if (w.age==arrayman.get(i).age) { //�˻� ����
				age=arrayman.get(i).age;
				live=arrayman.get(i).live;
				id=arrayman.get(i).id;
				gender=arrayman.get(i).gender;
			}
		}
		System.out.println("ã�� ���� "+age+"�� "+live+"��� "+id+"�� ����ϴ� "+gender+"�Դϴ�.");
	}
	void messageTo(Person from, Person to) {
		//�� > ��
		if (from instanceof Woman) {
			for (int i=0; i<arrayman.size(); i++) {
				if (to.id.equals(arrayman.get(i).id)) {
					arrayman.get(i).msg.add(from.id+"����"+arrayman.get(i).id+"�Բ� �޼��� ����");
				}
			}
		//�� > ��
		} else {
			for (int i=0; i<arraywoman.size(); i++) {
				if (to.id.equals(arraywoman.get(i).id)) {
					arraywoman.get(i).msg.add(from.id+"����"+arraywoman.get(i).id+"�Բ� �޼��� ����");
				}
			}
		}
	}
	void saveMessage() {
		ArrayList<String> msglist=new ArrayList<String>();
		//���� ���� �迭�� ����
		msglist.add("=====���ڰ� ���ڷκ��� ���� ����=====");
		for (int i=0; i<arrayman.size(); i++) {
			for (int j=0; j<arrayman.get(i).msg.size(); j++) {
				msglist.add(arrayman.get(i).msg.get(j));
			}
		}
		//���� ���� �迭�� ����
		msglist.add("=====���ڰ� ���ڷκ��� ���� ����=====");
		for (int i=0; i<arraywoman.size(); i++) {
			for (int j=0; j<arraywoman.get(i).msg.size(); j++) {
				msglist.add(arraywoman.get(i).msg.get(j));
			}
		}
		
		//���� ����
		BufferedWriter bw=null;
		FileWriter fw = null;
		try {
			fw = new FileWriter("message_log.txt",true);
			bw= new BufferedWriter(fw);
			for (int i=0; i<msglist.size(); i++) {
				fw.write(msglist.get(i)+"\n");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				fw.close();
				bw.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}		
	}
	
	
	void displayInfo(Person p) {
		System.out.println("id�� "+p.id+"�Դϴ�.");
		System.out.println("���� ������");
		for (int i=0; i<p.msg.size(); i++) {
			System.out.println(p.msg.get(i));
		}
	}
}
