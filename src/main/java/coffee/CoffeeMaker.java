package coffee;

import dagger.Lazy;

import javax.inject.Inject;

/**
 * Created by prince on 2019/07/09.
 */
public class CoffeeMaker {

    private final Lazy<Heater> heater;
    private final Pump pump;

    @Inject
    CoffeeMaker(Lazy<Heater> heater, Pump pump) {
        this.heater = heater;
        this.pump = pump;
    }

    public void brew() {

    }
}
