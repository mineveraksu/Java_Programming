package day27_AccessModifiers;

public class AccessModifiers {

    public static int publicDate=200;

    protected static int protecteddata=300;
    static int defaultData=500;
    private static int privateData=500;


    public static void main(String[] args) {
        System.out.println(publicDate);
        System.out.println(protecteddata);
        System.out.println(defaultData);
        System.out.println(privateData);
    }
}
