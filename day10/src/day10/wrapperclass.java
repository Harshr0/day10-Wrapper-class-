package day10;

public class wrapperclass {

	public static void main(String[] args) {
     byte b =10;
     short s = 20;
     int i = 30;
     long l = 40;
     float f = 50.0F;
     double d = 60.0D;
     char c = 'a';
     boolean b2 = true;
     
     Byte byteobj = b;
     Short shortobj = s;
     Integer intobj = i;
     Long longobj = l;
     Float floatobj = f;
     Double doubleobj = d;
     Character charobj = c;
     Boolean booleanobj = b2;
     
     System.out.println("byte object: "+ byteobj);
     System.out.println("short object: " + shortobj);
     System.out.println("Integer object: " + intobj );
     System.out.println("long object: " + longobj);
     System.out.println("float object: " + floatobj);
     System.out.println("double object: " + doubleobj);
     System.out.println("character object: " + charobj);
     System.out.println("boolean object: " + booleanobj);
     
     byte bytevalue = byteobj;
     short shortvalue = shortobj;
     int intvalue = intobj;
     long longvalue = longobj;
     float floatvalue = floatobj;
     double doublevalue = doubleobj;
     char charvalue = charobj;
     boolean booleanvalue = booleanobj;
     
     System.out.println("byte value: "+ bytevalue);
     System.out.println("short value: " + shortvalue);
     System.out.println("Integer value: " + intvalue );
     System.out.println("long value: " + longvalue);
     System.out.println("float value: " + floatvalue);
     System.out.println("double value: " + doublevalue);
     System.out.println("character value: " + charvalue);
     System.out.println("boolean value: " + booleanvalue);
     
     
	}

}
