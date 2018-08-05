package chapter1;

import java.util.ArrayList;
import java.util.List;

public class MethodOOM {

	private static List<String> list = new ArrayList<String>();

	public static void main(String[] args) {
		Integer i = 0;
		while (true) {
			i++;
			if (i % 10000 == 0) {
				System.out.println(i);
			}
			list.add(String.valueOf("javaboy").intern());
		}

	}

}
