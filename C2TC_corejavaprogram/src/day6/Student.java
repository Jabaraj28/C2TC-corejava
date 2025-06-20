package day6;

public class Student {
	private String name;
	private static int id;
	private static int reg;
	private final static int X;
	static
	{
		X=100;
		System.out.println("static block executed..");
	}
	
	public Student() {
		id++;
		reg++;
		System.out.println("constructor called..");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Student.id = id;
	}
	
	public static int getReg() {
		return reg;
	}
	public static void setReg(int reg) {
		Student.reg = reg;
	}
	@Override
	public String toString() {
		return "Student [id:"+id+"reg:"+reg+"name=" + name +"]";
	}
	

}
