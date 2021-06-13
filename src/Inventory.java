import java.util.ArrayList;

public class Inventory { // Inventory class, includes an array list to add the vehicles that will be created in test class.

       static ArrayList<Vehicle> vehicles = new ArrayList<>(); // Array list to add vehicles in it.
       static int total_price; // Total price of all vehicles.
       static int car_amount; // Car amount in the vehicles array list.
       static int motorbike_amount; // Motorbike amount in the vehicles array list.

       public static void printer(){ // A method that prints each element in the vehicles arraylist with it's properties.
           for (Vehicle vehicle : vehicles) {
               System.out.print(vehicle.model_name + " with");
               // If any additional options are added to the vehicle, following code will be executed.
               if (vehicle.seat_heating || vehicle.abs || vehicle.airbag || vehicle.music_system || vehicle.sun_roof) {
                   if (vehicle.abs) {
                       System.out.print(" ABS,");
                   }
                   if (vehicle.music_system) {
                       System.out.print(" Music System,");
                   }
                   if (vehicle.airbag) {
                       System.out.print(" Airbag,");
                   }
                   if (vehicle.sun_roof) {
                       System.out.print(" Sun Roof,");
                   }
                   if (vehicle.seat_heating) {
                       System.out.print(" Seat Heating,");
                   }
               }
               else { // If no additional options are added, following code will be executed.
                   System.out.print(" no additional options");
               }
               System.out.println(" having a price of " + vehicle.total_vehicle_price + " TL.");

               total_price += vehicle.total_vehicle_price;

               if (vehicle instanceof Car){
                   car_amount +=1;
               }
               if (vehicle instanceof Motorbike){
                   motorbike_amount += 1;
               }
           }
           System.out.println("TOTAL: " + (car_amount+motorbike_amount) + " Vehicles including " + car_amount+
                   " cars and " + motorbike_amount + " motorbikes having total price of " + total_price + " TL.");
       }
}
