public abstract class Motorbike extends Vehicle {

    public abstract int cost();

    public void set_seat_heating() {
        total_vehicle_price += 2000;
        seat_heating = true;
    }

    @Override
    // Invalid options for the motorcycle class.
    public void set_airbag() {
    }

    @Override
    public void set_music_system() {
    }

    @Override
    public void set_sun_roof() {
    }
}