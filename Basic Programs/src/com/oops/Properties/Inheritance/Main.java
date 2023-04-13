package com.oops.Properties.Inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box();
//        Box box2 = new Box(4);
//        Box box3 = new Box(6, 3, 1);
//        Box box4 = new Box(box2);
//
//        System.out.println(box.l + " " + box.w + " " + box.h);
//        System.out.println(box2.h);
//        System.out.println(box3.h + " " + box3.l + " " + box3.w);
//        System.out.println(box4.h);

        // using inheritance
        Boxweight bos = new Boxweight();
        Boxweight bos2 = new Boxweight(56, 78, 6, 8);
        Boxweight bos3 = new Boxweight(43);
        System.out.println(bos.h + " " + bos.weight );
        System.out.println(bos3.h + " " + bos3.weight);
        System.out.println(bos2.h + " " + bos2.w + " " + bos2.l + " " + bos2.weight);

        /* both of the reference variable will not works as it depends on the type of reference variable

        Box dos = new Boxweight(3, 5, 6, 7);
        Boxweight mos = new Box(3,5,6);
        System.out.println(dos.h + " " + dos.weight);

        // here you can't access the 'weight' as the type of reference variable determines what member is goin
        to be access but not the type of  object which is being created
         */

        // multilevel inheritance example
        Boxprice cost = new Boxprice(43, 12, 65, 87, 43);
        System.out.println(cost.cost + " " + cost.weight + " " + cost.w );
        Boxprice c = new Boxprice();
        System.out.println(c.l + " " + c.cost + " " + c.weight);
    }
}
