package wipro.com.Collection.List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Assignment7 
{
	int empId;
	String empName;
	String gender;
	double salary;
	public Assignment7(int empId,String empName,String gender,double salary)
	{
		this.empId=empId;
		this.empName=empName;
		this.gender=gender;
		this.salary=salary;
	}
	public static void main(String[] args)
	{
		Assignment7 p1=new Assignment7(101, "suresh", "Male", 5600);
		Assignment7 p2=new Assignment7(102, "ramesh", "Male", 6530);
		Assignment7 p3=new Assignment7(101, "harish", "Male", 8562);
		Vector<Assignment7> v=new Vector<>();
		v.add(p1);
		v.add(p2);
		v.add(p3);
		Assignment7 a;
/*Iterator<Assignment7> i=v.iterator();
		while(i.hasNext())
		{
			a=i.next();
			System.out.println(a.empId+" "+a.empName+" "+a.gender+" "+a.salary);
		}*/
		
	Enumeration<Assignment7> i=v.elements();
	 while(i.hasMoreElements())
	 {
		 a=i.nextElement();
		 System.out.println(a.empId+" "+a.empName+" "+a.gender+" "+a.salary);
	 }
	
	}
}
