package LowLevelDesign.Lec3_Abstractclasses_and_interfaces.AbstractClasses;


public class Main {

    public static void main(String[] args) {
        Product p = new Macbook();
        p.termsAndConditions();

        Product p2 = new Lenovo();
        p2.termsAndConditions();
    }
}
