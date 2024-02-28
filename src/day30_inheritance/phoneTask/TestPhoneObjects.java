package day30_inheritance.phoneTask;

public class TestPhoneObjects {
    public static void main(String[] args) {
        IPhone iphone=new IPhone("Iphone12","Large","Black",1000.5);
        Samsung samsung=new Samsung("Glaxy s22","Medium","White",1100);
        Nokia nokia=new Nokia("Brick","Small","pink",50);

        iphone.call(911);
        samsung.call(911);
        nokia.call(911);

        iphone.text(123456);
        samsung.text(123456);
        nokia.text(123456);

        iphone.faceTime(123456);
        samsung.freeze();
        nokia.selfDefense();
    }
}
