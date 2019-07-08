package coffee;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

/**
 * Created by prince on 2019/07/09.
 */
@Module(includes = PumpModule.class)
class DripCoffeeModule {

    @Provides
    @Singleton
    Heater provideHeater() {
        return new ElectricHeater();
    }
}
