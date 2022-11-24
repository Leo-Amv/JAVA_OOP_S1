public class HotDrink extends Bottle {
    private int temp;

    public HotDrink(String name, double price, double volume, int temp) {
        super(name, price, volume);
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "Name='" + super.getName() + '\'' +
                ", Price=" + super.getPrice() + '\'' +
                ", Volume=" + super.getVolume() + '\'' +
                ", Temp=" + this.temp +
                '}';
    }
}
