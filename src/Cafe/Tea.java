package Cafe;

public class Tea extends Beverages{
    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding Lemon");
    }

    @Override
    protected void addExtras() {
        System.out.println("Adding extra Salt");
    }
}
