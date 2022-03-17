package examples.vehicles.basic;

import java.util.List;

public class Bus implements Vehicle {

  private final String registration;
  private final int wheels;
  private final List<String> route;

  public Bus(String registration, int wheels, List<String> route) {
    this.registration = registration;
    this.wheels = wheels;
    this.route = route;
  }

  @Override
  public String getRegistrationPlate() {
    return registration;
  }

  @Override
  public int countWheels() {
    return wheels;
  }

  public String nextStop() {
    return route.get(0);
  }
}
