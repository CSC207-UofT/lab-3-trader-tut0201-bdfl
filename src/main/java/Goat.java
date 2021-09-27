public class Goat implements Tradable, Domesticatable{

    private int speed;

    public Goat( int fast) {this.speed = fast;}

    @Override
    public int getPrice() {
        return this.speed * 2;
    }


    @Override
    public String sound() {
        return "Yeehaw";
    }









}
