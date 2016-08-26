package Project_my;

public class Main {

	public static void main(String[] args) {
		DataHandler dh=new DataHandler();
		
		dh.intsertPerson(new Man(25, 1, "id1", "pass1", true));
		dh.intsertPerson(new Man(30, 2, "id2", "pass2", true));
		dh.intsertPerson(new Man(28, 3, "id3", "pass3", true));
		dh.intsertPerson(new Man(35, 1, "id4", "pass4", true));
		dh.intsertPerson(new Man(26, 2, "id5", "pass5", true));
		
		dh.intsertPerson(new Woman(25, 1, "id6", "pass6", false));
		dh.intsertPerson(new Woman(30, 2, "id7", "pass7", false));
		dh.intsertPerson(new Woman(28, 3, "id8", "pass8", false));
		dh.intsertPerson(new Woman(35, 1, "id9", "pass9", false));
		dh.intsertPerson(new Woman(26, 2, "id10", "pass10", false));
		
		dh.matchPerson(dh.arraywoman.get(3));
		dh.messageTo(dh.arraywoman.get(3), dh.arrayman.get(3));
		dh.messageTo(dh.arraywoman.get(3), dh.arrayman.get(3));
		dh.messageTo(dh.arrayman.get(3), dh.arraywoman.get(3));
		dh.messageTo(dh.arrayman.get(3), dh.arraywoman.get(3));
		dh.displayInfo(dh.arrayman.get(3));
		dh.displayInfo(dh.arraywoman.get(3));
		dh.saveMessage();
		

	}
}
