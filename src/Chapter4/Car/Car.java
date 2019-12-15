package Chapter4.Car;

public class Car {

    //Define variables
    //Behold! Encapsulation! Now people cannot directly access the variable, rather, they must use the get/set methods in the class
    private String brand;
    private int mileage;
    private String color;

    //And now for out get/set methods
    void setBrand(String enterBrand) {
        brand = enterBrand;
    }

    String getBrand() {
        return brand;
    }

    void setMileage(int enterMileage) {
        mileage = enterMileage;
    }

    int getMileage() {
        return mileage;
    }

    void setColor(String enterColor) {
        color = enterColor;
    }

    String getColor() {
        return color;
    }

}
