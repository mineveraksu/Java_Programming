package day26_statics;

public class TestIphoneObjects {
    public static void main(String[] args) {
        Iphone iphone=new Iphone("iphone12","black",1000);
        System.out.println(iphone.color);
        System.out.println(iphone.model);
        System.out.println(iphone.price);

        iphone.printPhoneInfo();
        System.out.println(iphone.brand);
        System.out.println(iphone.OS);
        iphone.printOperatingSystem();
        
    }
}
