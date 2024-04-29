//W.A.J. P to create one thread by extending Thread class in another Class.

package assignmentR;

 class thread extends Thread{
	 
	 public void run() {
		 
		 for(int i=0;i<5;i++) {
				System.out.println("By Thread Extends");
			}
	 }
 }
 
public class ThreadExtends  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thread t=new thread();
		t.start();
        
	}

}
