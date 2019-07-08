package coffee;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Thermosiphon_Factory implements Factory<Thermosiphon> {
  private final Provider<Heater> heaterProvider;

  public Thermosiphon_Factory(Provider<Heater> heaterProvider) {
    this.heaterProvider = heaterProvider;
  }

  @Override
  public Thermosiphon get() {
    return provideInstance(heaterProvider);
  }

  public static Thermosiphon provideInstance(Provider<Heater> heaterProvider) {
    return new Thermosiphon(heaterProvider.get());
  }

  public static Thermosiphon_Factory create(Provider<Heater> heaterProvider) {
    return new Thermosiphon_Factory(heaterProvider);
  }

  public static Thermosiphon newThermosiphon(Heater heater) {
    return new Thermosiphon(heater);
  }
}
