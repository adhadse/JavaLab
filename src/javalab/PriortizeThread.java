/**
 *  April 15, 2021
 */

package javalab;
import static src.KotlinUtils.print;


public class PriortizeThread extends Thread {
    public void run() {
        int count=0;
        do {
            print("Thread name " + Thread.currentThread().getName() +
                    " | Thread Priority: " + Thread.currentThread().getPriority());
            count++;
        } while (count<5);
    }

    static class Apr15 {
        public static void main(String[] args) {
            var pThread = new PriortizeThread();
            pThread.setPriority(MAX_PRIORITY);
            pThread.start();
            int count=0;
            do {
                print("Code outside of thread | Thread name " + Thread.currentThread().getName() +
                        " | Thread Priority: " + Thread.currentThread().getPriority());
                count++;
            } while (count<5);
        }
    }
}
