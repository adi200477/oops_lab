import java.util.Scanner;

class StringManipulation {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
String a, b, c;

System.out.print("Enter a string: ");
a = s.next();

System.out.print("Enter another string: ");
b = s.next();
c = a + b;
System.out.println("Length of 1st string: " + a.length());
System.out.println("Length of 2nd string: " + b.length());
System.out.println("Concatenation of strings: " + c);
System.out.println("Character at position 5 of " + c + ": " + c.charAt(5));
System.out.println("Comparison of strings: " + a.compareTo(b));
System.out.println("Last index of 's' is: " + c.lastIndexOf('s'));
System.out.println("Ends with character 'r': " + c.endsWith("r"));
System.out.println("Conversion to Uppercase: " + c.toUpperCase());
System.out.println("Conversion to Lowercase: " + c.toLowerCase());

s.close();
}
}
