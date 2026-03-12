import java.util.*;

class hash
{
 public static void main(String args[])
 {
  int n , i;
  String str;

  Scanner sc = new Scanner(System.in);

  HashSet<String> set1 = new HashSet<String>();
  System.out.println("Hashset 1");
  System.out.println("Enter no of countries :");
  n = sc.nextInt();
  sc.nextLine();   

  System.out.println("Enter the name of countries :");
  for(i=0; i<n; i++)
  {
   str = sc.nextLine();
   set1.add(str);
  }

  System.out.println("Hashset 2");
  HashSet<String> set2 = new HashSet<String>();

  System.out.println("Enter the no. of countries :");
  n = sc.nextInt();
  sc.nextLine();   

  System.out.println("Enter the name of countries :");
  for(i=0; i<n; i++)
  {
   str = sc.nextLine();
   set2.add(str);
  }

  System.out.println("Set 1: " + set1);
  System.out.println("Set 2: " + set2);

  HashSet<String> a = new HashSet<String>(set1);
  a.addAll(set2);
  System.out.println("Union of country set: " + a);

  HashSet<String> b = new HashSet<String>(set1);
  b.retainAll(set2);
  System.out.println("Intersection of country set: " + b);

  HashSet<String> c = new HashSet<String>(set1);
  c.removeAll(set2);
  System.out.println("Difference of country set: " + c);
 }
}
