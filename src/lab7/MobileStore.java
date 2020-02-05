package lab7;

public class MobileStore {

    public static void main(String[] args) {

        Mobile mobile1 = new Mobile();

        mobile1.setId("1001");
        mobile1.setBrand("Wiko");
        mobile1.setDetails("Sunny 4 plus");
        mobile1.setPrice(2090);
        mobile1.setSystem("Android 9 Go");

        System.out.println(mobile1.getId());
        System.out.println(mobile1.getBrand());
        System.out.println(mobile1.getDetails());
        System.out.println(mobile1.getPrice());
        System.out.println(mobile1.getSystem());

        Mobile mobile2 = new Mobile("2002","Apple","iphon 11 Pro",35900,"ios3");
        System.out.println(mobile2.getId());
        System.out.println(mobile2.getBrand());
        System.out.println(mobile2.getDetails());
        System.out.println(mobile2.getPrice());
        System.out.println(mobile2.getSystem());

        Mobile mobile3 = new Mobile("2003","Samsung","Galaxy E7",11500,"Android 4.4");
        System.out.println(mobile3.getId());
        System.out.println(mobile3.getBrand());
        System.out.println(mobile3.getDetails());
        System.out.println(mobile3.getPrice());
        System.out.println(mobile3.getSystem());


    }
}
