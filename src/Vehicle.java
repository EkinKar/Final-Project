public abstract class Vehicle {

    int total_vehicle_price = 0;
    String model_name;
    boolean airbag;
    boolean abs;
    boolean music_system;
    boolean sun_roof;
    boolean seat_heating;

    public void set_abs() {
        total_vehicle_price += 5000;
        abs = true;
    }

    public abstract void set_airbag();
    public abstract void set_music_system();
    public abstract void set_sun_roof();
    public abstract void set_seat_heating();
}
