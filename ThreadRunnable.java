//Q.W.A.J. P to create one thread by implementing Runnable interface in 
//Class.


package assignmentR;

public class ThreadRunnable implements Runnable {
	
	public void run() {
		
		for(int i=0;i<5;i++) {
			System.out.println("By Thread implements Runnable");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadRunnable t=new ThreadRunnable();
		t.run();
		Thread t1=new Thread(t); 
		t1.start();
		
	}

}
