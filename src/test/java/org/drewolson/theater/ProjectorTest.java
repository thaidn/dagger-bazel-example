package org.drewolson.theater;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProjectorTest {
  @Test
  public void playReturnsDetails() {
    TheaterComponent component = DaggerTheaterComponent.create();
    Projector projector = component.getProjector();

    assertEquals("Playing Interstellar with a running time of 169 mins. Is power on? true", projector.play());
  }
}
