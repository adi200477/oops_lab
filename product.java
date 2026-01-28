import java.io.*;
import java.util.*;

public class product
{
 int pcode;
 String pname;
 double price;

void stock(int a, String b, double c)
{
 pcode = a;
 pname = b;
 price = c;
}

void display()
{
 System.out.println(pname+","+price+","+pcode);
}

static void lowestprice(double p1,double p2, double p3)
{
 if (p1 <= p2 && p1<=p3)
 {
  System.out.println("p1 is lowest");
 }
 else if(p2 <= p1 && p2 <= p3)
 {
  System.out.println("p2 is lowest");
 }
 else
 {
  System.out.println("p3 is lowest");
 }
}

public static void main(String[]args)
{
 product obj1 = new product();
 product obj2 = new product();
 product obj3 = new product();
 obj1.stock(201, "Laptop",59000);
 obj2.stock(202, "Mobile",68999);
 obj3.stock(203, "Tab",39000);
 obj1.display();
 obj2.display();
 obj3.display();
 product.lowestprice(obj1.price, obj2.price,obj3.price);
 }
}
