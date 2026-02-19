import java.io.*;
import java.util.*;

class Publisher
{
 String name = "John";
}

class book extends Publisher
{
 String bookname = "Loard of the Rings";
}

class literature extends book
{
String type = "literature";
}

class fiction extends book
{
 String type = " fiction";
}

class library
{
 public static void main(String args[])
 { 
  literature ab = new literature();
  fiction bc = new fiction();
  System.out.println("Fiction book details :");
  System.out.println("Publisher."+bc.name+"| name is :"+bc.bookname+"|type is :"+bc.type);
  System.out.println("literature book details :");
  System.out.println("Publisher."+ab.name+"| name is :"+ab.bookname+"| type is :"+ab.type);
 }
}
