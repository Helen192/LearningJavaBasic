package helen.javacourse.lesson2;

public class beginn {
	private String name;
	private static int nextCountPersons = 1;
	private int countPersons;
	
	public beginn(String aname) {
		name = aname;
	}
	public beginn() {
		countPersons = nextCountPersons;
		nextCountPersons++;
		/*
		 * empty on purpose - default constructor
		 */
	}
	
	public String helloWorld() {
		return "Hello World";
	}
	public String hello(String aname) {
		return "Hello " + aname;
	}
	public int numberOfPersons() {
		return countPersons;
	}

}
