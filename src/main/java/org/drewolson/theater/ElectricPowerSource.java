package org.drewolson.theater;

import javax.inject.Inject;

public class ElectricPowerSource implements PowerSource {
  private Boolean isOn;

  @Inject
  public ElectricPowerSource() {
    isOn = false;
  }

  @Override
  public void turnOn() {
    isOn = true;
  }

  @Override
  public Boolean isOn() {
    return isOn;
  }
}
