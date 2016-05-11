package com.epam.init;

import com.epam.entity.Cake;
import com.epam.entity.Candy;
import com.epam.entity.box.Box;
import com.epam.service.PrintService;

public class Main {

    private static PrintService ser = new PrintService();

    public static void main(String[] args) {
        Box box = new Box();
        box.addSweet(new Cake("cake111", 6, 5));
        box.addSweet(new Cake("cake222", 2, 7));
        box.addSweet(new Candy("can111", "type1", "black", 3.6, 8));
        box.addSweet(new Candy("can222", "type2", "red", 3, 5));
        box.addSweet(new Candy("can333", "type3", "blue", 15, 1));


//       box.sortWeigh();  //TODO sort -> Weigh
       box.sortAmount();  //TODO sort -> Amount

        ser.print("Sweets", box.getAllSweets());
        ser.print("total weigh", box.getWeigh());
        ser.print("count type sweets", box.countTypeSweets());
        ser.print("all count sweets", box.getCountAllSweets());


    }
}
