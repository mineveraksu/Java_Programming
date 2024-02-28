package day39_collection.multithreading;

public class ThreadHelloWorld extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <6 ; i++) {
            System.out.println("Hello world" + i);
        }
    }
}
