package Resubmetion;

public class FineDiningRestaurant extends Restaurant {
    public FineDiningRestaurant(String name, String location) {
        super(name, location);
    }

    public FineDiningRestaurant(String name, String location, String menu) {
        super(name, location, menu);
    }

    @Override
    public String getType() {
        return "Fine Dining Restaurant";
    }
}

