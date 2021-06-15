public abstract class Motorbike extends Vehicle {

    // Forces all motorbikes to have a cost function.
    public abstract int cost();

    // Resets the validation value to true each time a new Motorbike is constructed.
    public Motorbike(){
        validation = true;
    }

    public void set_seat_heating() {
        total_vehicle_price += 2000;
        seat_heating = true;
    }

    @Override
    // Invalid options for the motorcycle class.
    public void set_airbag() {
        validation = false;
    }

    @Override
    public void set_music_system() {
        validation = false;
    }

    @Override
    public void set_sun_roof() {
        validation = false;
    }
}