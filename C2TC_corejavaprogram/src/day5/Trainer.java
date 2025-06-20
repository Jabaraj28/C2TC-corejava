//This program to demonstrate Trainer sub class or derived class 
package day5;

public class Trainer extends person {
	private String designation;
	private String location;
	
	public Trainer()
	{
		super()	;
		this.designation="program trainer";
		this.location="Chennai";
	}
	public Trainer (int id,String name, String city, String designation, String location)
		{
			super();
			this.designation=designation;
			this.location=location;
		}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Trainer [id="+getId()+", name="+getName() +", city="+getCity() +", designation=" + designation + ", location=" + location + "]";
	}

}
