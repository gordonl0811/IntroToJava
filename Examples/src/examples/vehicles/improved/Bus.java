package examples.vehicles.improved;

import java.util.List;

public class Bus extends BasicVehicle {

  private final List<String> route;

  public Bus(String registration, int wheels, List<String> route) {
    super(registration, wheels);
    this.route = route;
  }

  public String nextStop() {
    return route.get(0);
  }
}
