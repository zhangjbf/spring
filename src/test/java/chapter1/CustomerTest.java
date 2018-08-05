package chapter1;

import org.junit.Before;
import org.junit.Test;
import org.smart4j.chapter1.pojo.CustomerVO;
import org.smart4j.chapter1.service.impl.CustomerServiceImpl;

public class CustomerTest {

	private final CustomerServiceImpl customerServiceImpl;

	public CustomerTest() {
		customerServiceImpl = new CustomerServiceImpl();
	}

	@Before
	public void exceteSql() {

	}

	@Test
	public void add() {
		CustomerVO vo = new CustomerVO();
		vo.setName("javaboyok");
		try {
			customerServiceImpl.add(vo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void delete() {
		CustomerVO vo = new CustomerVO();
		vo.setName("javaboyok");
		try {
			CustomerVO add = customerServiceImpl.add(vo);
			System.out.println(add);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void update() {
		CustomerVO vo = new CustomerVO();
		vo.setName("javaboyok");
		try {
			customerServiceImpl.add(vo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void query() {
		CustomerVO vo = new CustomerVO();
		vo.setName("javaboyok");
		try {
			customerServiceImpl.add(vo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void lsit() {
//		List<String> list = new ArrayList<String>();
//		list.add("a");
//		list.add("b");
//		list.add("c");
//		list.add("d");
//		list.remove(2);
//		System.out.println(list);
//		
//		LinkedList listlink = new LinkedList<>();
//		listlink.add("a");
//		listlink.add("b");
//		listlink.add("c");
//		listlink.add("d");
//		listlink.addFirst("e");
//		System.out.println(listlink);

//		try {
//			throw new RuntimeException("javaboy");
//
//		} catch (RuntimeException e) {
//			System.out.println("RuntimeException");
//		} catch (Exception e) {
//			System.out.println("exception");
//		} finally {
//			System.out.println("finally");
//		}
		String testfinally = this.testfinally();
		System.out.println(testfinally);
	}

	private String testfinally() {
		try {
			System.out.println("javaboy");
			return "javaboy";
		} finally {
			System.out.println("finally");
			return "javaboyok";
		}

	}

}
