package org.drewolson.theater;

public class Main {
  public static void main(String[] args) {
    TheaterComponent component = DaggerTheaterComponent.create();
    Projector projector = component.getProjector();

    System.out.println(projector.play());
  }
}
