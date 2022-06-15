package day10;

public class unboxing {

	public static void main(String[] args) {
     Integer a = new Integer(10);
     
     int j = a.intValue(); // older version
     
     int i = a; // newer version
     
     
     System.out.println(a + " "+ j +" "+ i);
	}

}
