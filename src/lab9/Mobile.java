package lab9;

public class Mobile {
    private int MobileID;
    private String Brand;
    private String Generations;
    private Double Price;
    private String System;

    //constructor

    public Mobile(int mobileID, String brand, String generations, Double price, String system) {
        MobileID = mobileID;
        Brand = brand;
        Generations = generations;
        Price = price;
        System = system;
    }

    //getter and setter

    public int getMobileID() {
        return MobileID;
    }

    public void setMobileID(int mobileID) {
        MobileID = mobileID;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getGenerations() {
        return Generations;
    }

    public void setGenerations(String generations) {
        Generations = generations;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public String getSystem() {
        return System;
    }

    public void setSystem(String system) {
        System = system;
    }

    //toString

    @Override
    public String toString() {
        return "Mobile{" +
                "MobileID=" + MobileID +
                ", Brand='" + Brand + '\'' +
                ", Generations='" + Generations + '\'' +
                ", Price=" + Price +
                ", System='" + System + '\'' +
                '}';
    }
}
