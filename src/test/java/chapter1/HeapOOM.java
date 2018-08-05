package chapter1;

import java.util.ArrayList;
import java.util.List;

public class HeapOOM {

	static class OOM {

	}

	public static void main(String[] args) {
		List<OOM> list = new ArrayList<>();
		Integer i = 0;
		while (true) {
			list.add(new OOM());
			i++;
			if (i % 10000 == 0) {
				System.out.println(i);
			}
		}
	}

}
