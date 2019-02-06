package org.drewolson.theater;

import dagger.Module;
import dagger.Provides;

@Module
public class TheaterModule {
  @Provides
  public PowerSource providePowerSource() {
    return new ElectricPowerSource();
  }

  @Provides
  public Film provideFilm() {
    return new Interstellar();
  }
}
