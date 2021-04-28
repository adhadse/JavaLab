/**
 *  April 15, 2021
 */

package javalab;
import static src.KotlinUtils.print;

public class ThreadStop extends Thread {
    boolean continueThread=true;

    public void run() {
        int count=0;
        if (continueThread) {
            do {
                try {
                    print("Thread name " + Thread.currentThread().getName());
                    count++;
                  Thread.currentThread().stop();
                } catch (Exception e) {
                    return;
                }
            } while (count < 5);
        } else {
            System.out.println(Thread.currentThread().getName()+" ENDED");
        }
    }

    static class Apr15 {
        public static void main(String[] args) {
            var sThread = new ThreadStop();
            sThread.start();
//            sThread.continueThread = false;

            int count=0;
            do {
                print("Code outside of thread | Thread name " + Thread.currentThread().getName());

                count++;
            } while (count<5);
        }
    }
}
