package Framework;

public abstract class Factory {
	public final Product create() {
		return createProduct(); // �߻��Լ��� ��ǰ ����
	}

	protected abstract Product createProduct(); // ��üȭ�� Ŭ�������� ������ ��ǰ ���� �޼���
}