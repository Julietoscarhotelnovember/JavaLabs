package DrinkMachine;
class Exchange {
	public int exhangeCoin(int i, String str) {
		int sum=i;
		System.out.printf("�� ������� %s �Դϴ�.\n", str);
		switch (str) {
			case "A": i=i-1000; break;
			case "B": i=i-700; break;
			case "C": i=i-500; break;
		}
		if (i>=0) {
			System.out.printf("�ܾ��� %d�� �Դϴ�.\n", i);
			return i;
		} else {
			System.out.printf("�ܾ��� %d�� �����մϴ�.\n",i*(-1));
			return sum;
		}
	}
}