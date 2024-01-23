package practice;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class InterviewInheri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test=new TestGiven();
		
	test.getSum(10, 20L);
	//super.getSum(10,20L);
	
	C3 c3=new C3();
	c3.f1();
		HashSet<String> link=new HashSet<String>();
		link.add(null);
		link.add("rock");
		link.add("shock");
		//link.add(null);
		
		System.out.println(link);

	}

}

class TestGiven extends Test{
	String color="black";
	public  void getSum(int a,long b) {
		//return a+b;
		
		System.out.println("sum of child int= "+(a+b));
		super.getSum(a, b);
	}
	
}
class Test{
	String color="white";
	public  void getSum(int a,long b) {
		//return a+b;
		
		System.out.println("sum of int= "+(a+b));
	}
	public void getSum(long a,int b) {
		System.out.println("sum of long first = "+(a+b));
	}
	
	
	
	
}


 class C1 
{
  void f1(){
    System.out.println("f1 in class C1");  
 }
}
 class C2 extends C1 
{
  void f1() {
     System.out.println("f1 in class C2");
 }
}
 class C3 extends C2 
{
  void f1() {
	  //super.super.f1();
System.out.println("f1 in class C3"); 
   }
 }