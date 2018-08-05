package chapter1;

public class StackOOM {
	
	private static void syso(Integer i) {
		i++;
		if(i%10000==0) {
			System.out.println(i);;
		}
		syso(i);
	}
	
	public static void main(String[] args) {
		Integer i = 0;
		syso(i);
	}

}
