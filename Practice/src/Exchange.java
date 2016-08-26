class Exchange {
	public int exhangeCoin(int i, String str) {
		int sum=i;
		System.out.printf("고른 음료수는 %s 입니다.\n", str);
		switch (str) {
			case "A": i=i-1000; break;
			case "B": i=i-700; break;
			case "C": i=i-500; break;
		}
		if (i>=0) {
			System.out.printf("잔액은 %d원 입니다.\n", i);
			return i;
		} else {
			System.out.printf("잔액이 %d원 부족합니다.\n",i*(-1));
			return sum;
		}
	}
}