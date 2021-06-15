public abstract class Car extends Vehicle {

    // Forces all cars to have a cost function.
    abstract public int cost();

    // Resets the validation value to true each time a new Car is constructed.
    public Car(){
        validation = true;
    }

    public void set_music_system() {
        total_vehicle_price += 1000;
        music_system = true;
    }

    public void set_sun_roof() {
        total_vehicle_price += 2000;
        sun_roof = true;
    }

    public void set_airbag() {
        total_vehicle_price += 3000;
        airbag = true;
    }

    @Override
    // Invalid option for the Car class.
    public void set_seat_heating() {
        validation = false;
    }
}