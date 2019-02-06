package org.drewolson.theater;

import javax.inject.Inject;

public class Projector {
  private PowerSource powerSource;
  private Film film;

  @Inject
  public Projector(PowerSource powerSource, Film film) {
    this.powerSource = powerSource;
    this.film = film;
  }

  public String play() {
    powerSource.turnOn();

    return "Playing " + film.getName() +
        " with a running time of " + film.getRunningTime() + " mins. " +
        "Is power on? " + powerSource.isOn();
  }
}
