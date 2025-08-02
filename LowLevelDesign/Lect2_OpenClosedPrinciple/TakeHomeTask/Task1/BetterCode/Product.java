package LowLevelDesign.Lect2_OpenClosedPrinciple.TakeHomeTask.Task1.BetterCode;

public class Product {
    private final double price;
    private final DiscountInterface discountInterface;

    public Product(double price, DiscountInterface discountInterface) {
        this.price = price;
        this.discountInterface = discountInterface;
    }

    public double getPrice() {
        return price;
    }

    public double calculateDiscount() {
        return discountInterface.applyDiscount(price);
    }

}
