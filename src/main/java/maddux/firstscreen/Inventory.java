package maddux.firstscreen;
// this should be part
public class Inventory {
    private int id;
    private String name;
    private int inventory;
    private int price;



    public Inventory(int id, String name, int inventory, int price){
        this.id = id;
        this.name = name;
        this.inventory = inventory;
        this.price = price;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

