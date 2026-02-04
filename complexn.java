import java.io.*;
import java.util.*;
class complexn{
int r;
int c;
complexn(int real,int comp){
r=real;
c=comp;
}
void display(){
System.out.println(r+"+"+c+"i");
}
static void add(int r1,int c1,int r2,int c2){
int re=r1+r2;
int co=c1+c2;
System.out.println("Sum=" +re+ "+"+co+"i");
}

public static void main(String args[]){
complexn first=new complexn(4,3);
complexn second=new complexn(5,6);
first.display();
second.display();
complexn.add(first.r,first.c,second.r,second.c);
}
}
