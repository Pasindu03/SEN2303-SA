package Cafe;

abstract class Beverages {
    private boolean wantsExtras;

    public final void finalTemplateMethod(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        if (wantsExtras) {
            addExtras();
        }
    }

    public void setWantsExtras(boolean wantsExtras) {
        this.wantsExtras = wantsExtras;
    }

    public void boilWater(){
        System.out.println("Boiling Water");
    }

    protected abstract void brew();

    protected abstract void addCondiments();

    public void pourInCup(){
        System.out.println("Pouring into cup");
    }

    protected abstract void addExtras();
}
