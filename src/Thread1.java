/*
This class uses a thread to count up to 20
 */
public class Thread1 extends Thread {

    public void run() {
        System.out.println("Thread 1:");
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); //Start new line
    }
}