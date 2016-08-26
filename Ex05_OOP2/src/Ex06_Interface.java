//클래스 관의 관계
//1.상속(부모-자식)
//2.포함(상속이 되지 않는 것을 has~a관계로 표시)
//3.포함(의존, 연관) > 클래스 안에 다른 클래스의 객체를 갖는 것에 따라 분류됨
//4.포함(직접(new, 클래스의 타입)/간접(interface))

//인터페이스
//1.다형성: 서로 연관이 없는 클래스를 묶어주는 역할
//2.다형성: 직접적인 관계를 간접적인 관계로 풀어준다

//문서 해석 시스템
interface Iparserable {
	void parse(String filename);
}

// word, xml, html
class WordParser implements Iparserable {

	@Override
	public void parse(String filename) {
		System.out.println(filename + " Word 해석 완료");
	}
}

class HtmlParser implements Iparserable {

	@Override
	public void parse(String filename) {
		System.out.println(filename + " Html 해석 완료");
	}
}

class XmlParser implements Iparserable {

	@Override
	public void parse(String filename) {
		System.out.println(filename + " Xml 해석 완료");
	}
}

class ParserManager {
	// 1단계
	/*
	 * public static WordParser wordparser(String type) { return new
	 * WordParser(); } public static HtmlParser htmlparser(String type) { return
	 * new HtmlParser(); } public static XmlParser xmlparser(String type) {
	 * return new XmlParser(); }
	 */

	// 2단계
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
		
		//1단계
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
