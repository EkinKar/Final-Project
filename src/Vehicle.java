public abstract class Vehicle {

    int total_vehicle_price = 0;
    String model_name;
    static boolean validation = true;
    boolean airbag;
    boolean abs;
    boolean music_system;
    boolean sun_roof;
    boolean seat_heating;

    // common attribute of all current vehicles.
    public void set_abs() {
        total_vehicle_price += 5000;
        abs = true;
    }

    // Abstract classes to help with catching errors.
    public abstract void set_airbag();
    public abstract void set_music_system();
    public abstract void set_sun_roof();
    public abstract void set_seat_heating();

    public static void validate() throws InvalidOptionException { // checks if the car is constructed with valid options.
        if (!validation){
            throw new InvalidOptionException("Invalid option won't be added to the vehicle.");
        }
    }
}
