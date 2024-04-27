/* Create a class named 'Member' having the following members: 
1. Data members 
2. Name 
3. Age 
4. Phone number 
5. Address 
6. Salary 
It also has a method named 'printSalary' which prints the salary of the members.*/


package assignmentR;

public class Member {
	
	 int Datamembers ;
	 String Name;
	 int Age ;
	 int Phonenumber ;
	 String Address;
	 public void name(String name) {
		 System.out.println("name:-"+name);
	 }
	public void printsalary(int salary) {
		System.out.println("Salary is :"+salary);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
              Member m=new Member();
              m.name("jaydeep");
              m.printsalary(20000);
	}

}
