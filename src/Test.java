public class Test {
    public static void main (String [] args){

        Car car1 = new Sivic();
        car1.set_abs();
        car1.set_music_system();
        car1.set_airbag();
        Inventory.vehicles.add(car1);

        Car car2 = new Sivic();
        car2.set_abs();
        car2.set_sun_roof();
        Inventory.vehicles.add(car2);

        Car car3 = new Sity();
        car3.set_music_system();
        car3.set_sun_roof();
        Inventory.vehicles.add(car3);

        Motorbike motor1 = new Racer();
        motor1.set_abs();
        motor1.set_seat_heating();

        try { // Try Catch usage example.
            motor1.set_airbag();
            throw new InvalidOptionException();
        }
        catch (InvalidOptionException e){
            System.out.println(e.getMessage());
        }
        Inventory.vehicles.add(motor1);

        Motorbike motor2 = new Scooter();
        motor2.set_seat_heating();
        Inventory.vehicles.add(motor2);

        Inventory.printer();
    }
}
