/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Spenser Tacinelli
 */

import java.util.Scanner;

public class Exercise_9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Length: ");
        String l_s = scanner.nextLine();
        int length = Integer.parseInt(l_s);

        System.out.print("Width: ");
        String w_s = scanner.nextLine();
        int width = Integer.parseInt(w_s);

        final float area = length * width;
        final float gallon = area / 350;
        final double gallons_needed = Math.ceil(gallon);
        final int g_needed = (int) gallons_needed;

        //You will need to purchase 2 gallons of paint to cover 360 square feet.
        System.out.println("You will need to purchase " + g_needed + " gallon sof paint to" +
                " cover " + area + " square feet.");
    }
}