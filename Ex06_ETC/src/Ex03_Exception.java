//�� pc�� ���� ��ġ
//���ӽõ� �ֱ�
//�ӽ������� �õ� ���� ����
//�ӽ������� ������ ������ �ν���
//�ӽ����� ���� ����

//�ν��� ���� ���� �߻� > �ӽ������� ���� ����
//�������� �ν��� > �ӽ������� ���� ����

//�߿�: try �Ǵ� catch ������ return���� ������ "finally ���� ����ȴ�"

public class Ex03_Exception {
	static void StartInstall() {
		System.out.println("�ν��� ����");
	}

	static void CopyFile() {
		System.out.println("�õ����� �ӽ������� ����");
	}

	static void DeleteFile() {
		System.out.println("�ӽ����� ���� ����");
	}

	public static void main(String[] args) {
		try {
			StartInstall();
			CopyFile();
			// ���ܸ� ���� ������ ������
			Exception ex = new Exception("Copy ����");
			throw ex; // ���� ������

			// throw new new Exception("Copy ����"); �̷��� �ص� ��
		} catch (Exception e) {
			System.out.println("���� �߻�: " + e.getMessage());
			// DeleteFile();
			// ��·�� ���� ������ �ؾ� �Ǳ� ������ finally���� �δ� ����...
		} finally { // ���α׷��� ������/������������ ����Ǹ� ����Ǵ� ����
					  // DB ������ �� ���� ���� ���
			DeleteFile();
		}
		//try catch�� ���α׷��� ���������� ������, �帧�� �����ϰ� �� ���� �ִ�
		//���� �� �� �ַ� Runtime Exception�� ���� ��κ� ó���� �� �ִ�
	}
}
