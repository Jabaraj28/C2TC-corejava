package day4;

public class MyClass {

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
	private MyClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	

	

}
