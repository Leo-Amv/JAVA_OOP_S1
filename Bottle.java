public class Bottle extends Product {

    private Double volume;

    public Bottle(String name, Double price, Double volume) {
        super(name, price);
        this.volume = volume;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Bottle{" +
                "Name='" + super.getName() + '\'' +
                ", Price=" + super.getPrice() + '\'' +
                ", Volume=" + this.volume +
                '}';
    }
}