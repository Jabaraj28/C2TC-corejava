package day4;


public class student {
private static student s1 = new student();
	
	public static student getS1() {
		return s1;
	}
	public static void setS1(student s1) {
		student.s1 = s1;
	}
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "MyClass [id=" + id + ", name=" + name + "]";
	}
	private student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}


