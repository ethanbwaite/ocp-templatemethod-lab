package lab.assignment.afterrefactoring;

public abstract class CoffeeMakerTemplate {

    public final void prepareCoffee(){
        boilWater();
        brewEspresso();
        addIngredients();
        finalTouch();
        System.out.println(">>Serving Coffee");
    }

    // public void prepareAmericanoCoffee(){
    //     boilWater();
    //     brewEspresso();
    //     addIngredientsForAmericano();
    //     finalTouchForAmericano();
    // }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void brewEspresso() {
        System.out.println("Brewing espresso");
    }

    protected abstract void addIngredients();
    protected abstract void finalTouch();

}
