/**
 *  April 1, 2021
 */

package javalab;

import static src.KotlinUtils.print;

public class ThreadWithExtend extends Thread {
    public void run() {
        int count=0;
        do {
            print("Thread created by extending Thread class " + Thread.currentThread().getName());
            count++;
        } while (count<5);
    }

    static class Apr01 {
        public static void main(String[] args) {
            var exThread = new ThreadWithExtend();
            exThread.start();
            int count=0;
            do {
                print("Code outside of thread" + Thread.currentThread().getName());
                count++;
            } while (count<5);
        }
    }
}

