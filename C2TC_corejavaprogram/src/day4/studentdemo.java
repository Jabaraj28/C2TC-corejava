package day4;

public class studentdemo {

	public static void main(String[] args) {
		student st=student.getS1();
		st.setId(101);
		st.setName("jabaraj");
		
		
		student st1=student.getS1();
		System.out.println(st1);
		System.out.println(st);

	}

}
