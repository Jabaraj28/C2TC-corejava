package Polymorphism.Overriding;

public class Square extends Shape {
	
	public Square(float area) {
		super.area=area;
		
	}
	@Override
	public void calArea()
	{
		System.out.println("From Square class:"+super.area*area*super.area);
	    
	}

}
