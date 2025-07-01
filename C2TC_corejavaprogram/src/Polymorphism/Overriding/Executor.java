package Polymorphism.Overriding;

public class Executor {

	public static void main(String[] args) {
		Shape s1= new Shape();
		
		s1.calArea();
		
		s1=new Square(5.2f);
		s1.calArea();
		
		s1=new Rectangle(5.2d,4.5d);
		s1.calArea();

	}

}
