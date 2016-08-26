//내 pc에 게임 설치
//게임시디 넣기
//임시폴더에 시디 내용 복사
//임시폴더의 내용을 가지고 인스톨
//임시폴더 내용 삭제

//인스톨 도중 오류 발생 > 임시폴더의 내용 삭제
//정상적인 인스톨 > 임시폴더의 내용 삭제

//중요: try 또는 catch 블럭에서 return문을 만나도 "finally 블럭은 수행된다"

public class Ex03_Exception {
	static void StartInstall() {
		System.out.println("인스톨 시작");
	}

	static void CopyFile() {
		System.out.println("시디파일 임시폴더에 복사");
	}

	static void DeleteFile() {
		System.out.println("임시폴더 파일 삭제");
	}

	public static void main(String[] args) {
		try {
			StartInstall();
			CopyFile();
			// 예외를 만들어서 강제로 던지기
			Exception ex = new Exception("Copy 오류");
			throw ex; // 에러 던지기

			// throw new new Exception("Copy 오류"); 이렇게 해도 됨
		} catch (Exception e) {
			System.out.println("문제 발생: " + e.getMessage());
			// DeleteFile();
			// 어쨌든 파일 삭제를 해야 되기 때문에 finally에만 두는 것이...
		} finally { // 프로그램이 정상적/비정상적으로 종료되면 실행되는 구문
					  // DB 연결할 때 자주 쓰는 방법
			DeleteFile();
		}
		//try catch는 프로그램을 변경하지는 않지만, 흐름을 제어하게 할 수도 있다
		//개발 할 때 주로 Runtime Exception을 보면 대부분 처리할 수 있다
	}
}
