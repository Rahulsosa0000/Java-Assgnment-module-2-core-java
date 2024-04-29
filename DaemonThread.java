//Q.W.A.J.P to create 2 threads and make one thread as Daemon Thread by using set Daemon () method of Thread class and check whether the thread is set daemon or not by using is Daemon () method.
//TestDaemonThread2 t1=new TestDaemonThread2();
//TestDaemonThread2 t2=new TestDaemonThread2(); t1.start();
//t1.setDaemon(true);//will throw exception here t2.start();



package assignment;


 class TestDaemonThread2 extends Thread{
	 
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Thread1 is DaemonThread");
		}else {
			System.out.println("Thread2 is not DaemonThread");
		}
	}
}

public class DaemonThread {

public static void main(String []args) {
	
	TestDaemonThread2 t1=new TestDaemonThread2();
	TestDaemonThread2 t2=new TestDaemonThread2();
	t1.setDaemon(true);
	t1.start();
	t2.start();
	
	
}

}
