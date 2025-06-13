package day1;

public class Primitivedatatype {
	public static void main(String[]args) {
		byte byteMax = 127;
		byte byteMin = -128;
		
		System.out.println("Min range of byte is" + byteMin+"Max range of byte is" + byteMax);
		
        short shortMax = 32767;
        short shortMin = -32768;
        System.out.println("shortMax range of byte is" + shortMax+"shortMin range of byte is" + shortMin);
        
		int maxInt = 214748347;
		int minInt = -2147483648;
		System.out.println("maxint range of byte is" + maxInt + "minint range of byte is" + minInt);
		
		long maxLong = 9223372036854775807L;
		long minLong = -9223372036854775808L;
		System.out.println("Minlong range of bytes is" + minLong+ "Maxlong range od bytes is" + maxLong);
		
		float f=3234.141243278345f;
		double d=3456.14124512345678902345678914f;
		System.out.println("float value is "+f+" double value is "+d);
		
		//boolean 
		boolean flag=false;
		System.out.println("boolean value is "+flag);
		
		}
	

}
