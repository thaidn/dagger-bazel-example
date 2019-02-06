package org.drewolson.theater;

import dagger.Component;

@Component(modules = TheaterModule.class)
public interface TheaterComponent {
  Projector getProjector();
}
