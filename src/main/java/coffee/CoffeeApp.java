package coffee;

import dagger.Component;

import javax.inject.Singleton;

/**
 * Created by prince on 2019/07/09.
 */
public class CoffeeApp {


    @Singleton
    @Component(modules = { DripCoffeeModule.class})
    public interface CoffeeShop {
        CoffeeMaker maker();
    }

    public static void main(String[] args) {
        System.out.println("Brewing coffee......");
        CoffeeShop coffeeShop = DaggerCoffeeApp_CoffeeShop.builder().build();
        coffeeShop.maker().brew();
    }
}
