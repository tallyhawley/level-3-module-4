                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      package threads;

import java.util.ArrayList;

public class ThreadedReverseGreeting {
  //Write a program that creates a thread (Thread 1) that creates another thread (Thread 2); 
  //Thread 2 creates Thread 3; and so on, up to Thread 50. 
  //Each thread should print "Hello from Thread <num>!", 
  //but you should structure your program such that the threads print their greetings in reverse order.

	static ArrayList<Thread> array = new ArrayList<Thread>();
	
	private static void createArray(int n) {
		final int temp = n;
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("hello from thread " + temp + "!");
			}
		});
		n++;
		if(n<=50) {
			createArray(n);
		}
		array.add(thread);
		thread.start();
	}
	
	public static void main(String[] args) {
		createArray(1);
		
	}
}
