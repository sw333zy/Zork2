package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What direction you wish to travel in (1)");
        String choice = keyboard.next();
        int room = Integer.parseInt(choice.substring(1,1));

        do{
            switch(room){
                case 1:
                    foyer(choice);
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
            }
        } while(true);
    }

    public static String foyer(String choice){
        System.out.println("You are in foyer \n It contains : dead scorpion\n You can go North in room 2 (n2)");
        switch(choice){
            case "n":
                System.out.println("going to room 2");
                frontRoom();
                break;
            case "s":
            case "e":
            case "w":
                System.out.println("Invalid choice");
        }
        return "";
    }

    public static void frontRoom(){
        System.out.println("You are in front Room \n It contains : piano \n Choices (s1/w3/e4)");
        String choice = "";
        switch(choice){
            case "n":
                System.out.println("Invalid choice");
            case "s":
            case "e":
            case "w":
                System.out.println("Invalid choice");
                break;
        }
    }
    public static void library(){
        System.out.println("You are in the library \n It contains : spider \n Choices (e2/n5)");
        switch(){
            case 2:
                break;
            case 5:
                break;
        }
    }
    public static void kitchen(){
        System.out.println("You are in the Kitchen \n It contains : bats \n Choices (w2/n7)");
        switch(){
            case 2:
                break;
            case 7:
                break;
        }
    }
    public static void diningRoom(){
        System.out.println("You are in the Dining Room\n It contains : dust empty box \n Choices (r3)");
        library();
    }
    public static void vault(){
        System.out.println("You are in the vault\n It contains : 3 walking skeletons \n Choices (e7/e8)");

    }
    public static void parlor(){
        System.out.println("You are in the parlor\n It contains : treasure chest\n Choices (w6/s4)");
    }
    public static void secretRoom(){
        System.out.println("You are in the secret room\n It contains : piles of gold\n Choices (w6)");
    }
}
