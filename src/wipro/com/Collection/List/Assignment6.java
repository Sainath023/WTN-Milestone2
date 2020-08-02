package wipro.com.Collection.List;

import java.util.Iterator;
import java.util.Vector;

public class Assignment6 {
	int stdid;
	String stdname;
	String subname1;
	String subname2;
	float marks1;
	float marks2;
	public Assignment6(int stdid,String stdname,String subname1,float marks1,String subname2,float marks2)
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
		Assignment6 a1=new Assignment6(101, "ramesh","C",65,"Java", 69);
		Assignment6 a2=new Assignment6(102, "suresh","C",92,"Java",89);
		Assignment6 a3=new Assignment6(103, "harish","C",89,"Java", 91);
		Vector<Assignment6> v=new Vector<>();
		v.add(a1);
		v.add(a2);
		v.add(a3);
		Iterator<Assignment6> i=v.iterator();
		Assignment6 b;
		while(i.hasNext())
		{
			b=i.next();
			System.out.println(b.stdid+" "+b.stdname+" "+b.subname1 +"="+b.marks1+" "+b.subname2+"="+b.marks2);
		}
	}
}
