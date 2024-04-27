
//Q.Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and 
//$200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC' 
//are subclasses of class 'Bank', each having a method named 'getBalance'. Call this 
//method by creating an object of each of the three classes.

package assignmentR;

  abstract class Bank{
	  public abstract void getbalance();
  }
  class BankA extends Bank{
	  public void getbalance() {
		  System.out.println("$100 are deposited in bankA.");
	  }
  }
  
  class BankB extends Bank{
	  public void getbalance() {
		  System.out.println("$150 are deposited in bankB.");
	  }
  }
  
  class BankC extends Bank{
	  public void getbalance() {
		  System.out.println("$200 are deposited in bankC.");
	  }
  }
public class AbsBank {
	
	public static void main(String[]args) {
		
		BankA A=new BankA();
		A.getbalance();
		BankB B=new BankB();
		B.getbalance();
		BankC C=new BankC();
		C.getbalance();
	}

}
