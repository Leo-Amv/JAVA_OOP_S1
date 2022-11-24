import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
        public static void main(String[] args) {
                List<Product> list = new ArrayList<>(Arrays.asList(
                                new Product("Chocolate", 30.5),
                                new Product("Candy", 12.0)));
                Machine machine = new Machine(list);
                String desired = "Candy";
                System.out.println(machine.getByName(desired));

                List<Product> listBottle = new ArrayList<>(Arrays.asList(
                                new Bottle("Lemonade", 25.5, 1.0),
                                new Bottle("Juice", 10.5, 0.5)));
                Machine bottleMachine = new BottleMachine(listBottle);
                String desiredBottle = "Lemonade";
                System.out.println(bottleMachine.getByName(desiredBottle));

                List<Product> listHotDrinks = new ArrayList<>(Arrays.asList(
                                new HotDrink("Coffee", 35.0, 0.25, 85),
                                new HotDrink("Tea", 20.0, 0.25, 75)));
                Machine hotDrinksMachine = new HotDrinksMachine(listHotDrinks);
                String hotDrink = "Coffee";
                System.out.println(hotDrinksMachine.getByName(hotDrink));
        }
}