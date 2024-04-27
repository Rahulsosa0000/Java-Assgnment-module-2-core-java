//Q.We have to calculate the percentage of marks obtained in three subjects (each out of 
//100) by student A and in four subjects (each out of 100) by student B. Create an 
//abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two 
//other classes 'A' and 'B' each having a method with the same name which returns the 
//percentage of the students. The constructor of student A takes the marks in three 
//subjects as its parameters and the marks in four subjects as its parameters for student 
//B. Create an object for each of the two classes and print the percentage of marks for 
//both the students. 


package assignmentR;

 abstract class Marks{
	
	 public abstract double getpercentage();
	 
 }
 class A extends Marks{
	 
	 double subject1;
	 double subject2;
	 double subject3;
	 
	 A(double s1,double s2,double s3){
		 subject1=s1;
		 subject2=s2;
		 subject3=s3;
	 }
	 public double getpercentage() {
		 return (subject1+subject2+subject3)/3;
	 }
 }
     class B extends Marks{
    	 double sub1;
    	 double sub2;
    	 double sub3;
    	 double sub4;
    	 B(double s1,double s2,double s3,double s4){
    		 sub1=s1;
    		 sub2=s2;
    		 sub3=s3;
    		 sub4=s4;
    	 }
    	 public double getpercentage() {
    		 
    		 return (sub1+sub2+sub3+sub4)/4;
    	 }
     }

public class Percentageabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              A studentA=new A(80,75,66);
              B studentB=new B(80,75,66,90);
              
       System.out.println("StudentA of Percentage:-"+studentA.getpercentage()+"%");
       System.out.println("StudentB of Percentage:-"+studentB.getpercentage()+"%");

	}

}
