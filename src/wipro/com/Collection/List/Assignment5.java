package wipro.com.Collection.List;

import java.util.ArrayList;
import java.util.Iterator;

public class Assignment5 
{
int stdid;
String stdname;
String subname1;
String subname2;
float marks1;
float marks2;
public Assignment5(int stdid,String stdname,String subname1,String subname2,float marks1,float marks2)
{
	this.stdid=stdid;
	this.stdname=stdname;
	this.subname1=subname1;
	this.subname2=subname2;
	this.marks1=marks1;
	this.marks2=marks2;
}
public static void main(String[] args) 
{
	Assignment5 a1=new Assignment5(101, "ramesh","C","Java",65, 69);
	Assignment5 a2=new Assignment5(102, "suresh","C","Java",92, 89);
	Assignment5 a3=new Assignment5(103, "harish","C","Java",89, 91);
	ArrayList<Assignment5> al=new ArrayList<>();
	al.add(a1);
	al.add(a2);
	al.add(a3);
	Iterator<Assignment5> i=al.iterator();
	Assignment5 a;
	while(i.hasNext())
	{
		a=i.next();
		System.out.println(a.stdid+" "+a.stdname+" "+a.subname1+" "+a.subname2+" "+a.marks1+" "+a.marks2);
	}
}
}
