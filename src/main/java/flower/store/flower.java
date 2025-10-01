package flower.store;

import lombok.Getter;
import lombok.Setter;



@Setter
public class flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public String getColor() {
        return color.toString() + "123";
    }
}
