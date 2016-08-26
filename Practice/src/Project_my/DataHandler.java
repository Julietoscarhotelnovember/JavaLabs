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
			if (w.age==arrayman.get(i).age) { //검색 조건
				age=arrayman.get(i).age;
				live=arrayman.get(i).live;
				id=arrayman.get(i).id;
				gender=arrayman.get(i).gender;
			}
		}
		System.out.println("찾은 상대는 "+age+"세 "+live+"출신 "+id+"를 사용하는 "+gender+"입니다.");
	}
	void messageTo(Person from, Person to) {
		//여 > 남
		if (from instanceof Woman) {
			for (int i=0; i<arrayman.size(); i++) {
				if (to.id.equals(arrayman.get(i).id)) {
					arrayman.get(i).msg.add(from.id+"님이"+arrayman.get(i).id+"님께 메세지 보냄");
				}
			}
		//남 > 여
		} else {
			for (int i=0; i<arraywoman.size(); i++) {
				if (to.id.equals(arraywoman.get(i).id)) {
					arraywoman.get(i).msg.add(from.id+"님이"+arraywoman.get(i).id+"님께 메세지 보냄");
				}
			}
		}
	}
	void saveMessage() {
		ArrayList<String> msglist=new ArrayList<String>();
		//남자 쪽지 배열에 저장
		msglist.add("=====남자가 여자로부터 받은 쪽지=====");
		for (int i=0; i<arrayman.size(); i++) {
			for (int j=0; j<arrayman.get(i).msg.size(); j++) {
				msglist.add(arrayman.get(i).msg.get(j));
			}
		}
		//여자 쪽지 배열에 저장
		msglist.add("=====여자가 남자로부터 받은 쪽지=====");
		for (int i=0; i<arraywoman.size(); i++) {
			for (int j=0; j<arraywoman.get(i).msg.size(); j++) {
				msglist.add(arraywoman.get(i).msg.get(j));
			}
		}
		
		//파일 저장
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
		System.out.println("id는 "+p.id+"입니다.");
		System.out.println("받은 쪽지는");
		for (int i=0; i<p.msg.size(); i++) {
			System.out.println(p.msg.get(i));
		}
	}
}
