public class Sheep implements Domesticatable, Tradable {
    private int milk;

    public Sheep() {
        this.milk = 5;
    }

    @Override
    public String sound() {
        return "Braap!";
    }

    @Override
    public int getPrice() {
        return this.milk * 10;
    }
}
