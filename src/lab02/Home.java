package lab02;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Home {

    private String color, desc, floors;
    private double price;

    public Home(String floors, String color, String desc, double price) {
        setColor(color);
        setDesc(desc);
        setPrice(price);
    }

    public static List<String> getFloors() {
        List<String> floors = Arrays.asList("1", "2", "3", "4","5");
        Collections.sort(floors);
        return floors;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price >= 10000 && price <= 1000000 )
            this.price = price;
        else
            throw new IllegalArgumentException("Price is out of range!");
    }

    public String toString()
    {
        return String.format(desc, "color is " ,color, "and price is ",price);
    }
}
