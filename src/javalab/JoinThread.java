/**
 *  April 15, 2021
 */

package javalab;
import static src.KotlinUtils.print;


public class JoinThread extends Thread {
    public void run() {
        int count=0;
        do {
            try {
                print("Thread name " + Thread.currentThread().getName());
                Thread.currentThread().interrupt();
            } catch(Exception ignored) {
                print("Exception caught | " + ignored);
            }
            count++;
        } while (count<5);
    }

    static class Apr15 {
        public static void main(String[] args) {
            var jThread1 = new JoinThread();
            var jThread2 = new JoinThread();
            var jThread3 = new JoinThread();

            jThread1.start();
            try {
                jThread1.join(); // waits for jThread1 to die
                print("Thread name " + Thread.currentThread().getName());
            } catch(Exception ignored) {
                print("Exception caught | " + ignored);
            }

            jThread2.start();
            try {
                jThread2.join();
                print("Thread name " + Thread.currentThread().getName());
            } catch(Exception ignored) {
                print("Exception caught | " + ignored);
            }

            jThread3.start();
            try {
                jThread3.join();
                print("Thread name " + Thread.currentThread().getName());
            } catch(Exception ignored) {
                print("Exception caught | " + ignored);
            }

            int count=0;
            do {
                print("Code outside of thread | Thread name " + Thread.currentThread().getName());
                count++;
            } while (count<5);
        }
    }
}
