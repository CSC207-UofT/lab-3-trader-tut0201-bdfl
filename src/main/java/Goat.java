public class Goat implements Drivable, Domesticatable, Tradable {
    private int thing;

    public Goat() { this.thing = 3; }

    @Override
    public String sound() { return "Baa!"; }

    @Override
    public void upgradeSpeed() { this.thing++; }

    @Override
    public void downgradeSpeed() { this.thing--; }

    @Override
    public int getMaxSpeed() { return this.thing; }

    @Override
    public int getPrice() {
        return 5;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max baa: " + this.thing +")";
    }
}
