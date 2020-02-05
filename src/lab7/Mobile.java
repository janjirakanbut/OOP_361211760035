package lab7;

public class Mobile {

    private String id;
    private String brand;
    private String details;
    private int price;
    private String system;

    public Mobile(){}

    public Mobile(String id, String brand, String details, int price, String system) {
        this.id = id;
        this.brand = brand;
        this.details = details;
        this.price = price;
        this.system = system;
    }

    //Behavior คือ พฤติกรรมของวัตถุ
    public void id() {
        System.out.println("id");
    }

    public void brand() {
        System.out.println("brand");
    }

    public void details() {
        System.out.println("details");
    }

    public void price() {
        System.out.println("price");
    }

    public void system() {
        System.out.println("system");
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return this.brand = brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDetails() {
        return this.details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSystem() {
        return this.system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

}
