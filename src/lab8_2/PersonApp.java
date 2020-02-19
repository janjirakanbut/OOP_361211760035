package lab8_2;

public class PersonApp {
    public static void main(String[] args) {

        //create objects
        Person P1 = new Person("Janjira Kanbut","1998");
        Person P2 = new Sheriff("Kasinee boontawe","1998","Thungsong");
        Person P3 = new Police("manee jaidee","1996","Nakhorn");

        P1.introduce();
        P2.introduce();
        P3.introduce();
    }

}
