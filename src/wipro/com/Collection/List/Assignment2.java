package wipro.com.Collection.List;

import java.util.ArrayList;
import java.util.Iterator;



public class Assignment2 
{

	int empId;
	String empName;
	String email;
	String gender;
	float salary;
	public Assignment2(int empId,String empName,String email,String gender,float salary)
	{
		this.empId=empId;
		this.empName=empName;
		this.email=email;
		this.gender=gender;
		this.salary=salary;
	}

	public static void main(String[] args) 
	{
		Assignment2 p1=new Assignment2(101, "suresh", "suresh@gmail.com", "Male", 5600);
		Assignment2 p2=new Assignment2(102, "ramesh", "ramesh@gmail.com", "Male", 6530);
		Assignment2 p3=new Assignment2(101, "harish", "harish@gmail.com", "Male", 8562);
		ArrayList<Assignment2> al=new ArrayList<>();
		al.add(p1);
		al.add(p2);
		al.add(p3);
		GetEmployeeDetails(al);
	}
	public static  void GetEmployeeDetails(ArrayList<Assignment2> al)
	{
			Iterator<Assignment2> i=al.iterator();
			Assignment2 p;
			while(i.hasNext())
			{
				p=i.next();
		     System.out.println(p.empId+" "+p.empName+" "+p.email+" "+p.gender+" "+p.salary);
	       }
	}
}
