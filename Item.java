public class Item {
    private String name;
    private double price;



    // CONSTRUCTOR
    //   Takes a name and price as arguments 
    //   and sets them accordingly

    public Item(){}
    
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    // GETTERS & SETTERS  - for name and price
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return this.name;
    }
    public double getPrice() {
        return this.price;
    }

}
