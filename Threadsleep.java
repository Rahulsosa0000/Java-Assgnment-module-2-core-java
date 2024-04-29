//Q.W.A.J.P to create 2 threads and execute that threads by providing sleep time as 
//2000ms and check the execution. 

package assignmentR;

class threads extends Thread{
	
	String name;

	threads(String name) {
		this.name=name;
	}

	public void run() {
		try {
		for(int i=0;i<5;i++) {
			
			Thread.sleep(2000);
			System.out.println(name);
		}
		}catch(InterruptedException i) {
			System.out.println(i);
		}
	}
	
	
}

public class Threadsleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		threads thread1=new threads("Thread-1");
		
		threads thread2=new threads("Thread-2");
		
		thread1.start();
	
		thread2.start();
		
		
	}

}
