package CreationalPatterns.DP02_Factory;

public class PizzaFactory {

    public static Pizza createPizza(String type) {
        Pizza p = null;

        if (type.equals("cheese")) {
            p = new CheesePizza();
        } else if (type.equals("chicken")) {
            p = new ChickenPizza();
        } else if (type.equals("vege")) {
            p = new VegePizza();
        }

        return p;
    }

}
