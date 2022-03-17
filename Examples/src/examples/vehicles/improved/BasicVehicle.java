package examples.vehicles.improved;

public abstract class BasicVehicle implements Vehicle {

  private final String registration;
  private final int wheels;

  public BasicVehicle(String registration, int wheels) {
    this.registration = registration;
    this.wheels = wheels;
  }

  @Override
  public String getRegistrationPlate() {
    return registration;
  }

  @Override
  public int countWheels() {
    return wheels;
  }
}
