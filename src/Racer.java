public class Racer extends Motorbike{

    public Racer(){
        model_name = "Racer";
        total_vehicle_price += cost();
    }

    public int cost() {
        return 60000;
    }
}
