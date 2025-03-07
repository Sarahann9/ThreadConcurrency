/*
This class uses a thread to count down from 20
 */
public class Thread2 extends Thread {

    public void run() {
        System.out.println("Thread 2: ");
        for (int i = 20; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}