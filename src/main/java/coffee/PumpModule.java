package coffee;

import dagger.Binds;
import dagger.Module;

/**
 * Created by prince on 2019/07/09.
 */
@Module
abstract class PumpModule {

    @Binds
    abstract Pump providePump(Thermosiphon pump);
}
