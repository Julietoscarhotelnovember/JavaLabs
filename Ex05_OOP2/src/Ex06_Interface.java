//Ŭ���� ���� ����
//1.���(�θ�-�ڽ�)
//2.����(����� ���� �ʴ� ���� has~a����� ǥ��)
//3.����(����, ����) > Ŭ���� �ȿ� �ٸ� Ŭ������ ��ü�� ���� �Ϳ� ���� �з���
//4.����(����(new, Ŭ������ Ÿ��)/����(interface))

//�������̽�
//1.������: ���� ������ ���� Ŭ������ �����ִ� ����
//2.������: �������� ���踦 �������� ����� Ǯ���ش�

//���� �ؼ� �ý���
interface Iparserable {
	void parse(String filename);
}

// word, xml, html
class WordParser implements Iparserable {

	@Override
	public void parse(String filename) {
		System.out.println(filename + " Word �ؼ� �Ϸ�");
	}
}

class HtmlParser implements Iparserable {

	@Override
	public void parse(String filename) {
		System.out.println(filename + " Html �ؼ� �Ϸ�");
	}
}

class XmlParser implements Iparserable {

	@Override
	public void parse(String filename) {
		System.out.println(filename + " Xml �ؼ� �Ϸ�");
	}
}

class ParserManager {
	// 1�ܰ�
	/*
	 * public static WordParser wordparser(String type) { return new
	 * WordParser(); } public static HtmlParser htmlparser(String type) { return
	 * new HtmlParser(); } public static XmlParser xmlparser(String type) {
	 * return new XmlParser(); }
	 */

	// 2�ܰ�
	public static Iparserable getParser(String type) {
		if (type.equals("xml")) {
			return new XmlParser();
		} else if (type.equals("html")) {
			return new HtmlParser();
		} else {
			return new WordParser();
		}
	}
}

public class Ex06_Interface {

	public static void main(String[] args) {
		//hello.html, hello.xml, hello.word
		
		//1�ܰ�
		/*WordParser parser=ParserManager.wordparser("word");
		parser.parse("hello");
		HtmlParser parser2=ParserManager.htmlparser("html");
		parser2.parse("hello");
		XmlParser parser3=ParserManager.xmlparser("xml");
		parser3.parse("hello");*/
		
		Iparserable parser=ParserManager.getParser("xml");
		parser.parse("hello");
	}
}
