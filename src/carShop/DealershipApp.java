package carShop;

public class DealershipApp {

    public static void main(String[] args){
        Customer person = new Customer("Jesse", " Sosa");
        Car car = new Car("Toyota", "Tundra", "Gray", 2021);

        System.out.printf(person.describe(String.format("%s, %s, %s, %s", car.getColor(),
                car.getYear(), car.getMake(), car.getModel())));
    }
}
