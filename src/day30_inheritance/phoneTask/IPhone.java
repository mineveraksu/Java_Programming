package day30_inheritance.phoneTask;

public class IPhone extends Phone {

    public IPhone(String model, String size, String color, double price){
        super("apple",model,size,price,color);
    }

    public static boolean hasApplePay=true;

    public void faceTime(long phoneNumber){
        System.out.println(getModel() + "is facetiming with" + phoneNumber);

    }
    public void faceTime(String email){
        System.out.println(getModel() + "is face timing with" + email);
    }
}
