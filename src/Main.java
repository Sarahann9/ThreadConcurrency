/*
Main class, uses thread 1, waits for thread 1 to finish, then starts thread 2
 */
public class Main {
public static void main(String[] args) {

    Thread1 t1 = new Thread1();
    Thread2 t2 = new Thread2();

    t1.start();
    try {
        t1.join(); //Waits for thread 1 to finish
    }
    catch (InterruptedException e) { //throws exception if not finished
        throw new RuntimeException(e);
    }
    finally {
        t2.start(); //Starts thread 2
    }
}
}