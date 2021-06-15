public class Test {
    public static void main (String [] args) {

        Car car1 = new Sivic(); // creating a new Sivic.
        car1.set_abs();
        car1.set_music_system();
        car1.set_airbag();
        Inventory.vehicles.add(car1);


        Car car2 = new Sivic();
        car2.set_abs();
        car2.set_sun_roof();
        Inventory.vehicles.add(car2);
        try { // Try catch example with valid option.
            Vehicle.validate();
        }
        catch (InvalidOptionException e){
            System.out.println(e + "");
        }


        Car car3 = new Sity();
        car3.set_music_system();
        car3.set_sun_roof();
        Inventory.vehicles.add(car3);


        Motorbike motor1 = new Racer();
        motor1.set_abs();
        motor1.set_seat_heating();
        motor1.set_sun_roof();
        try {// Try catch example with invalid option.
            Vehicle.validate();
        }
        catch (InvalidOptionException e){
            System.out.println(e + "");
        }
        Inventory.vehicles.add(motor1);


        Motorbike motor2 = new Scooter();
        motor2.set_seat_heating();
        Inventory.vehicles.add(motor2);


        Inventory.printer();
    }
}
