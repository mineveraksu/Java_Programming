package day34_abstaraction.animalTask;

public interface Playable {
    boolean isFriendly = true;  //static&final

    public static void main(String[] args) {
        System.out.println(isFriendly);
    }

    default void method1() {
    }

    void play();  //abstract

}
