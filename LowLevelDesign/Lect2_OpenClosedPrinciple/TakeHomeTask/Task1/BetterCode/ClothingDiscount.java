package LowLevelDesign.Lect2_OpenClosedPrinciple.TakeHomeTask.Task1.BetterCode;

public class ClothingDiscount implements DiscountInterface{

    @Override
    public double applyDiscount(double price) {
        return price * 0.05;
    }
}
