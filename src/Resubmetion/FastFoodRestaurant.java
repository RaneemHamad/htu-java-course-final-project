package Resubmetion;

class FastFoodRestaurant extends Restaurant {
    

    public FastFoodRestaurant(String name, String location, String menu) {
        super(name, location, menu);
    }

    @Override
    public String getType() {
        return "Fast Food Restaurant";
    }
}