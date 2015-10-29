package learning.coffee;

import javax.inject.Inject;
import javax.inject.Singleton;

import learning.coffee.heat.Heater;
import learning.coffee.pump.Pump;

/**
 * CoffeeMaker
 * Created by mantou on 15/10/29.
 */
@Singleton
public class CoffeeMaker {
    Heater mHeater;
    Pump mPump;

    @Inject
    public CoffeeMaker(Heater heater, Pump pump) {
        mHeater = heater;
        mPump = pump;
    }

    public void make() {
        System.out.println("CoffeeMaker.make, " + toString());
        mHeater.heat();
        mPump.exec();
    }
}
