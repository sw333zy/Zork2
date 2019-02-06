package com.company;

import java.util.Scanner;

/**
 *___________________________________
 |          |           |     8     |
 |     5    |    6      |___________|
 |          |           |           |
 |_____ ____|___________|_____7 ____|
 |          |           |           |
 |    3     |    2      |     4     |
 |          |           |           |
 |__________|___________|___________|
 *          |           |
 *          |      1    |
 *          |           |
 *          |___________|
 */
public class Zork1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter house - Choice:(n1)");
        String choice;
        char direction = '1';
        int room = 1;
        while (true) {
            System.out.print("Enter Choice: ");
            choice = keyboard.next();
            direction = choice.charAt(0);
            room = Integer.parseInt(choice.substring(1,2));
            switch (room) { //Room
                case 1:
                    room = foyer(direction);
                    break;
                case 2:
                    room = frontRoom(direction);
                    break;
                case 3:
                    room = library(direction);
                    break;
                case 4:
                    room = kitchen(direction);
                    break;
                case 5:
                    room = diningRoom(direction);
                    break;
                case 6:
                    room = vault(direction);
                    break;
                case 7:
                    room = parlor(direction);
                    break;
                case 8:
                    room = secretRoom(direction);
                    break;
                default:
                    System.out.println("Invalid Room");
                    System.exit(1);
                    break;
            }
        }
    }

    public static int foyer(char direction) {
        System.out.println("Room: foyer \tcontains : dead scorpion\t Choices:(n2/s)");
        int room = 1;
        switch (direction) {
            case 'n':
                room = 2;
                break;
            case 's':
                System.exit(0);
            default:
                System.out.println("1Invalid direction");
        }
        return room;
    }

    public static int frontRoom(char direction) {
        System.out.println("Room: front Room \tContains : piano \tChoices:(s1/w3/e4)");
        int room = 2;
        switch (direction) {
            case 's':
                room = 1;
                break;
            case 'w':
                room = 3;
                break;
            case 'e':
                room = 4;
                break;
            default:
                System.out.println("2Invalid direction");
        }
        return room;
    }

    public static int library(char direction) {
        System.out.println("Room: library \tIt contains : spider \tChoices:(e2/n5)");
        int room = 3;
        switch (direction) {
            case 'e':
                room = 2;
                break;
            case 'n':
                room = 5;
                break;
            default:
                System.out.println("3Invalid direction");
        }
        return room;
    }

    public static int kitchen(char direction) {
        System.out.println("Room: Kitchen \tIt contains : bats \tChoices:(w2/n7)");
        int room = 4;
        switch (direction) {
            case 'w':
                room = 2;
                break;
            case 'n':
                room = 7;
                break;
        }
        return room;
    }

    public static int diningRoom(char direction) {
        System.out.println("Room: Dining Room \tIt contains : dust empty box \tChoice:(r3)");
        int room = 5;
        switch (direction) {
            case 's':
                room = 3;
                break;
            default:
                System.out.println("5Invalid direction");
        }
        return room;
    }

    public static int vault(char direction) {
        System.out.println("Room: vault\tIt contains : 3 walking skeletons \tChoices:(e7/e8)");
        int room = 6;
        switch (direction) {
            case 'e':
                int random = 1+(int)(Math.random()*100);
                if(random > 25){
                    room = 7;
                } else {
                    room = 8;
                }
                break;
            default:
                System.out.println("6Invalid direction");
        }
        return room;
    }

    public static int parlor(char direction) {
        System.out.println("Room: parlor\tContains : treasure chest\tChoices:(w6/s4)");
        int room = 7;
        switch (direction) {
            case 'w':
                room = 6;
                break;
            case 's':
                room = 4;
                break;
            default:
                System.out.println("7Invalid direction");
        }
        return room;
    }

    public static int secretRoom(char direction) {
        System.out.println("Room: Secret \tContains : piles of gold\tChoices (w6)");
        int room = 8;
        switch (direction) {
            case 'w':
                room = 6;
                break;
            default:
                System.out.println("8Invalid direction");
        }
        return room;
    }
}
