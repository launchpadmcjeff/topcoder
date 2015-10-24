package io.bar;

/**
 * 
 *  Demonstrate visibility failure in concurrent environment. The JVM optimizes
 *  away the check to stopRequested, so ReaderThread never sees the new value of stopRequested
 *  and runs forever. Adding volatile to stopRequested ensures visibility of updates
 *  to other threads. From JCIP.
 *  
 *  VM args: -server
 */
public class ThreadVisibility {
	// declare stopRequested as volatile to fix thread visibility issue
	private static boolean stopRequested = false;

	private static class ReaderThread extends Thread {
		public void run() {
			while (!stopRequested) {
				// Just spin
			}
			System.out.println("Done");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		ReaderThread readerThread = new ReaderThread();
		readerThread.start();
		Thread.sleep(1000);
		stopRequested = true;
	}
}
