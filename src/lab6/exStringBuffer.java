package lab6;

import java.util.StringTokenizer;

public class exStringBuffer {
    public static void main(String[] args) {
        //StringBuffer เป็นคลาสที่มีเมธิดต่างๆ
        // ที่สามารถปรับปรุงแก้ไขข้อมูลที่เป็น String ได้มากกว่าคลาส String ทั่วไป
        StringBuffer strBuf = new StringBuffer("Hello");
        System.out.println(strBuf);
        //append() ใช้สำหรับต่อ String
        strBuf.append("Saiyai");
        System.out.println(strBuf);
        System.out.println(strBuf.reverse());
        strBuf.delete(0,6);
        System.out.println(strBuf);

        //StringTokenizer นับคำ
        String s ="Thailand,officially the Kingdom of Thailand and formerly known as Siam," +
                "[b] is a country at the centre of the Southeast Asian Indochinese " +
                "Peninsula composed of 76 provinces. At 513,120 km2 (198,120 sq mi) " +
                "and over 68 million people, Thailand is the world's 50th-largest " +
                "country by total area and the 22nd-most-populous country. The capital and largest city " +
                "is Bangkok, a special administrative area. Thailand is bordered to the north" +
                " by Myanmar and Laos, to the east by Laos and Cambodia, " ;

        //word counting นับคำ
        StringTokenizer tokenizer = new StringTokenizer(s);
        int countWord =tokenizer.countTokens();
        System.out.println("Word count from message: "+countWord);

        //word cutting ตัดคำเป็นคำๆ
        while (tokenizer.hasMoreTokens()){
            System.out.println(tokenizer.nextToken());
        }
    }//main

}//class
