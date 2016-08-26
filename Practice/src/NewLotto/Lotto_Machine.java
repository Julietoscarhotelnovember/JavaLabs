package NewLotto;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lotto_Machine {

	Set<Integer> lottonum = new TreeSet<Integer>();
	
	
	void lottoNum() {
		for (int i = 0; lottonum.size() < 6; i++) {
			int num = (int) (Math.random() * 45) + 1;
			lottonum.add(num);
		}
	}
	Iterator<Integer> it=lottonum.iterator();
	void sumCheck() {
		int sum = 0;
		
		while (it.hasNext()) {
			sum+=it.next();
		}
		while (sum < 50 || sum > 200) {
			lottoNum();
		}
	}

	Set<Integer> plusnum = new LinkedHashSet<Integer>();

	void bonusNum() {
		/*for (int i=0; i < lottonum.size(); i++) {
			plusnum.add(it.next()); //Á¢±Ù
		}*/
		while (it.hasNext()) {
			plusnum.add(it.next());
		}
		for (int i = 0; i < 1; i++) {
			int num = (int) (Math.random() * 45) + 1;
			plusnum.add(num);
		}
		it=plusnum.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}