public class JetSki implements Drivable, Tradable{
    private int maxSpeed;
    private int price;

    public JetSki() {
        this.maxSpeed = 3;
        this.price = 30;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
