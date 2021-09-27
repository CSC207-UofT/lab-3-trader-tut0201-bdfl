/* A class that represents a bicycle
* */
public class Bicycle implements Drivable,Tradable {
    private int maxSpeed;
    private int price;

    /** Construct a Bicycle object with given price
     *  @param price the price of the Bicycle
     */
    public Bicycle(int price) {
        this.maxSpeed = 2;
        this.price = price;
    }

    /**Increase the maxSpeed by 2*/
    @Override
    public void upgradeSpeed() {
        this.maxSpeed += 2;
    }

    /**Decrease the maxSpeed by 2*/
    @Override
    public void downgradeSpeed() {
        this.maxSpeed -=2 ;
    }

    /** Return the maxSpeed of the Bicycle
     **/
    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /** Return the price of the Bicycle*/
    @Override
    public int getPrice() {
        return this.price;
    }

    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +") " + " (Price: " + this.price +")";
    }
}
