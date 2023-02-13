package Resubmetion;

  abstract class Restaurant {
    private String name;
    private String location;
    private String menu;

    public Restaurant(String name, String location) {//Contractor
        this.name = name;
        this.location = location;
        
       
    }
    
    public Restaurant(String name, String location, String menu) {//overloading
        this(name, location);
        this.menu = menu;	
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public abstract String getType();

    public void displayRestaurantDetails() {
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Menu: " + menu);
    }
}