//package chapter1;
/**
 * Represents a toy item in the inventory
 * <p>
 * Each toy has a name, brand, price, quality in stock,
 * and a size classification.
 * </p>
 * <ul>
 *      <li><b>name</b> - Name of the toy (e.g., "Gundam")</li>
 *      <li><b>brand</b> - Manufacturer or brand (e.g, "Lego")</li>
 *      <li><b>price</b> - Selling price of the toy</li>
 *      <li><b>quantity</b> - Number of units available</li>
 *      <li><b>size</b> - Size category (e.g., 'S','M','L')</li>
 *  </ul>
 * @author Marc Yim
 * @version 1.0
 * @since 1.0
 */

//javadoc Toy.java - to generate javadoc html files
public class Toy {
    // Class - basic building block of OOP, blueprint for creating objects
    // Object - instance of a class, has state (attributes) and behavior (methods)
    // Variable - state
    
    /**  Name of the toy */
    public String name; // parts

    /**  Manufacturer or brand */
    public String brand;

    /**  Selling price of the toy */
    public double price;

    /**  Number of units available */
    public int quantity;

    /**  Size category (e.g., 'S','M','L') */
    public char size;
    /**  
     * Set the Toy object price;
     * 
     * @param price the new price of the toy
     */ 
    public void setPrice(double price) { // This is a method, operates the state or variables.
        this.price = price;
    }
/* this is a sample 
* program if
* Toy class 
* is run
*
*/

    public static void main(String[] args) {
        Toy toy1 = new Toy();
        toy1.name = "Rage Pink";
        toy1.brand = "Lab Vuvu";
        toy1.price = 4500;
        toy1.quantity = 12;
        toy1.setPrice(toy1.price*0.5);
        System.out.println(toy1.price);
        System.out.println("end of program");
        
    }

}
class Fruit{

}
class Fruit2{
    
}class Fruit3{
    
}
/** Sample Fruit4 */
class Fruit4{
    //public static void main(String[] args) ✅
    // static public  void main(String[] args) ✅
    // public static void main(String[] marco) ✅
    //static  void main(String[] args)❌
    //public  void main(String[] args)❌
    // void main(String[] args)❌
    //public static  main(String[] args)❌
    //public static void main2(String[] args)❌
    // void public static main2(String[] args)❌
    // void public static main2(String[] 12marc)❌
    static public  void main(String[] hello) {
        System.out.println("🍌");
    }
    
}

class House{
    //lot number,block number,name,coordinates,
    //getLot getBlock,
}

class Inventory{
    public static void main(String[] args) {
        Toy toy1 = new Toy();
        toy1.brand = "Bandai";
        toy1.name = "RX-78";
        toy1.price = 2500;
        toy1.setPrice(toy1.price*2);
        toy1.quantity = 14;
        Toy toy2 = toy1; // toy2 is a reference to the same object as toy1
        System.out.println(toy1.price);
    }
}