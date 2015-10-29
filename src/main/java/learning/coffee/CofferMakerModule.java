package learning.coffee;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import learning.coffee.heat.ElectricalHeater;
import learning.coffee.heat.Heater;
import learning.coffee.pump.Pump;
import learning.coffee.pump.ThermosiphonPump;

/**
 * CofferMakerModule
 * Created by mantou on 15/10/29.
 */
@Module
public class CofferMakerModule {

    @Singleton
    @Provides
    Heater provideHeater() {
        return new ElectricalHeater();
    }

    @Singleton
    @Provides
    Pump providePump() {
        return new ThermosiphonPump();
    }
}
