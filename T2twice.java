//Q.W.A.J.P to start the same Thread twice by calling start () method twice.
//Test ThreadTwice1 t1=new TestThreadTwice1(); t1.start (); t1.start ();

package assignment;

class ThreadTwice1 extends Thread{
	
	public void run() {
		System.out.println("THREAD...");
	}
}

public class T2twice {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ThreadTwice1 t1=new  ThreadTwice1();
		t1.start();
	    t1.start();
	}

}
