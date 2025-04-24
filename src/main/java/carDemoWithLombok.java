import lombok;

@Getter
@Setter
@AllArgsConstructor
@ToString(exclude = {"quantity"})
@EqualsAndHashCode(exclude ={"model", "year", "price", "color", "quantity"})

public class CarWithLombok {
    private String model;
    private int year;
    private int price;
    private String color;
    private int quantity;
    private String brand;
}

class carDemoWithLombok{
    public static void main(String[] args) {
        CarWithLombok CarWithLombok1 = new CarWithLombok( model; "RX350", "Lexus", 2025,  500_000, "black", 2);
        CarWithLombok CarWithLombok2 = new CarWithLombok(model: "X6", brand: "BMW", year: 2025, price: 650_000, "white with touch of black", 2);
        System.out.println(CarWithLombok1);
        System.out.println(CarWithLombok2);
        System.out.println(CarWithLombok1.getColor());
        int year = CarWithLombok1.getYear();
        CarWithLombok1.setColor("black");
        System.out.println("Are these objects equal? " + CarWithLombok1.equals(CarWithLombok2));
        System.out.println("The HasCode of this objects is: " + CarWithLombok2.hashCode());
        System.out.println("The HasCode of this objects is: " + CarWithLombok1.hashCode());
    }
}