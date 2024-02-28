package day39_collection.multithreading;

public class TestMultıThreads {
    public static void main(String[] args) {

        ThreadHelloWorld thread1=new ThreadHelloWorld();
        thread1.start();
        ThreadHelloWorld thread2=new ThreadHelloWorld();
        thread2.start();
    }
}
