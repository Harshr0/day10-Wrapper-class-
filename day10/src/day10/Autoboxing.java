package day10;

public class Autoboxing {

	public static void main(String[] args) {
     int a = 10;
     
     Integer i = Integer.valueOf(a); //older version of autoboxing
     
     Integer k = a; // Newer version of autoboxing
     
     System.out.println(a + " " + i +" " + k);
	}

}
