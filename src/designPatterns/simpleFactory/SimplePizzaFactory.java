package designPatterns.simpleFactory;

/**
 * Created by xuan on 16-5-9.
 */
public class SimplePizzaFactory {
    public Pizza CreatePizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
