package LowLevelDesign.Lec3_Abstractclasses_and_interfaces.AbstractClasses;

public abstract class Product {

    public abstract double calculateDiscount();

    public void termsAndConditions(){
        System.out.println("Some Terms and Conditions");
    }
}
