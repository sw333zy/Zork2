package com.company;

import java.util.Scanner;

public class Zork1 {
    static Scanner keyboard = new Scanner(System.in);
    static String choice;

    public static void main(String[] args) {
        System.out.println("What direction you wish to travel in (type:1)");
        String choice = keyboard.next();
        char direction = '1';
        int room = 0;

        while(room != 2){
            if(choice.equals("n1")){
                direction = choice.charAt(0);
                room = foyer(direction);
            }
        }


        room = Integer.parseInt(choice.substring(1,2));
        while(choice.equals("n1")){
            switch(room){
                case 1:
                    room = foyer(direction);
                case 2:
                    room = frontRoom();
                case 3:
                    library();
                case 4:
                    kitchen();
                case 5:
                    diningRoom();
                case 6:
                    vault();
                case 7:
                    parlor();
                case 8:
                    secretRoom();
            }
        }
    }

    public static int foyer(char direction){
        System.out.println("You are in foyer \n It contains : dead scorpion\n You can only go to North in room 2 (n2)");
        switch(direction){
            case 'n':
                return 2;
            case 's':
            case 'e':
            case 'w':
                System.out.println("Invalid choice");
            default:
                return 1;
        }
    }

    public static int frontRoom(){
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
        return 0;
    }

    public static void library(){
        System.out.println("You are in the library \n It contains : spider \n Choices (e2/n5)");
//        switch(){
//            case 2:
//                break;
//            case 5:
//                break;
//        }
    }
    public static void kitchen(){
        System.out.println("You are in the Kitchen \n It contains : bats \n Choices (w2/n7)");
//        switch(){
//            case 2:
//                break;
//            case 7:
//                break;
//        }
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
