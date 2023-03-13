package maddux.firstscreen;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;

//Part needs to be abstract class but for testing purposes leave as public class Part for now.
/*public class Part extends Inventory {
    public Part(int id, String name, int inventory, int price) {
        super(id, name, inventory, price);
    }
*/
/**
 * Supplied class Part.java
 */

    /**
     *
     * @author Place Your Name Here
     */
    public abstract class Part {
        private int id;
        private String name;
        private double price;
        private int stock;
        private int min;
        private int max;
        public Part(int id, String name, double price, int stock, int min, int max) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.stock = stock;
            this.min = min;
            this.max = max;
        }

        /**
         * @return the id
         */
        public int getId() {
            return id;
        }

        /**
         * @param id the id to set
         */
        public void setId(int id) {
            this.id = id;
        }

        /**
         * @return the name
         */
        public String getName() {
            return name;
        }

        /**
         * @param name the name to set
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * @return the price
         */
        public double getPrice() {
            return price;
        }

        /**
         * @param price the price to set
         */
        public void setPrice(double price) {
            this.price = price;
        }

        /**
         * @return the stock
         */
        public int getStock() {
            return stock;
        }

        /**
         * @param stock the stock to set
         */
        public void setStock(int stock) {
            this.stock = stock;
        }

        /**
         * @return the min
         */
        public int getMin() {
            return min;
        }

        /**
         * @param min the min to set
         */
        public void setMin(int min) {
            this.min = min;
        }

        /**
         * @return the max
         */
        public int getMax() {
            return max;
        }

        /**
         * @param max the max to set
         */
        public void setMax(int max) {
            this.max = max;
        }







































/*  This is seperate from the public part line above.
    private int id;
    private String name;
    private int inventory;
    private int price;

    public  Part (int id, String name, int inventory, int price){
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




*/
    public static ObservableList<Part> getAllParts() {return allParts;}
    private static ObservableList<Part> allParts = FXCollections.observableArrayList();


}