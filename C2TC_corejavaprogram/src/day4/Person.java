package day4;

public class Person {
	private String personname;
	private int personAge;
	private String personCity;
	public String getPersonname() {
		return personname;
	}
	public void setPersonname(String personname) {
		this.personname = personname;
	}
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	public String getPersonCity() {
		return personCity;
	}
	public void setPersonCity(String personCity) {
		this.personCity = personCity;
	}
	public Person() {
		System.out.println("Default Constructor");
	}
	
	public Person(String personName, int personAge, String personCity) {
		System.out.println("Parameterized Constructor");
		this.personname = personName;
		this.personAge = personAge;
		this.personCity = personCity;
	}

	

}
