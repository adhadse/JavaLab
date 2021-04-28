/**
 *  April 1, 2021
 */

package javalab;

import static src.KotlinUtils.print;

// using Runnable interface
// 1. Create the object of that class which implements
//    Runnable interface
// 2. Create Thread object AND pass the object of the above class
//    Thread thread = new Thread(obj);
// 3. thread.start()
public class ThreadWithRunnableInterface implements Runnable {
    public void run() {
        int count = 0;
        do {
            print("Thread created by runnable interface " + Thread.currentThread().getName());
            count++;
        } while (count < 5);
    }

    static class Apr01 {
        public static void main(String[] args) {
            var obj = new ThreadWithRunnableInterface();
            Thread thread = new Thread(obj);
            thread.start();

            int count=0;
            do {
                print("Code outside of thread" + Thread.currentThread().getName());
                count++;
            } while (count<5);
        }
    }
}
