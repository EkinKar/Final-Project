public class Scooter extends Motorbike{

    public Scooter(){
        model_name = "Scooter";
        total_vehicle_price += cost();
    }

    public int cost() {
        return 20000;
    }
}
