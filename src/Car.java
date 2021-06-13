public abstract class Car extends Vehicle {

    abstract public int cost();

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
    public void set_seat_heating() {
    }
}