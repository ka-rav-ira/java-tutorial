package LowLevelDesign.Lec3_Abstractclasses_and_interfaces.AbstractClasses;

public class Macbook extends Product{
    @Override
    public double calculateDiscount() {
        return 0;
    }

    @Override
    public void termsAndConditions() {
        System.out.println("Macbook programming is fun");
    }

}
