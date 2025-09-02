package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LunchService lunchService = new LunchService();
        Lunch menu1 = new Lunch("떡볶이");
        Lunch menu2 = new Lunch("짜장면");

        List<Lunch> lunchList = new ArrayList<>();

        lunchList = lunchService.readLunch();
        lunchList.add(menu1);
        lunchService.writeLunch(lunchList);

        lunchList.add(menu2);
        lunchService.writeLunch(lunchList);


        List<Lunch> list = lunchService.readLunch();
        for(Lunch lunch : list){
            System.out.println(lunch.getMenu());
        }
    }
}