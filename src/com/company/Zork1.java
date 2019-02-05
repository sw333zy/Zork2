package com.company;

import java.util.Scanner;

public class Zork1 {
    static Scanner keyboard = new Scanner(System.in);
    static String choice;

    public static void main(String[] args) {
        System.out.println("Enter room 1 (1)");

        String choice;// = keyboard.next();
        char direction = '1';

        while (true) { //room
            System.out.println("Enter direction");
            direction = keyboard.next().charAt(0);
            System.out.println("Enter room");
            int room = keyboard.nextInt();
            // room = Integer.parseInt(choice.substring(1,2));
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
            }
        }
    }

    public static int foyer(char direction) {
        System.out.println("You are in foyer \n It contains : dead scorpion\n You can only go to North in room 2 (n2)");
        switch (direction) {
            case 'n':
                return 2;
            case 's':
            case 'e':
            case 'w':
            default:
                System.out.println("Invalid direction");
                return 1;
        }
    }

    public static int frontRoom(char direction) {
        System.out.println("You are in front Room \n It contains : piano \n Choices (s1/w3/e4)");
        int room = 2;
        switch (direction) {
            case 'n':
                System.out.println("Invalid choice");
                break;
            case 's':
                room = 1;
                break;
            case 'e':
                room = 4;
                break;
            case 'w':
                room = 3;
                break;
            default:
                room = 2;
                break;
        }
        return room;
    }

    public static int library(char direction) {
        System.out.println("You are in the library \n It contains : spider \n Choices (e2/n5)");
        int room = 3;
        switch (direction) {
            case 2:
                room = 2;
                break;
            case 5:
                room = 5;
                break;
            default:
                System.out.println("Invalid direction");
        }
        return room;
    }

    public static int kitchen(char direction) {
        System.out.println("You are in the Kitchen \n It contains : bats \n Choices (w2/n7)");
        int room = 4;
        switch (direction) {
            case 2:
                break;
            case 7:
                break;
        }
        return room;
    }

    public static int diningRoom(char direction) {
        System.out.println("You are in the Dining Room\n It contains : dust empty box \n Choices (r3)");
        int room = 5;
        switch (direction) {
            case 'n':
            case 's':
            case 'e':
            case 'w':
            default:
                System.out.println("Invalid direction");
        }
        return room;
    }

    public static int vault(char direction) {
        System.out.println("You are in the vault\n It contains : 3 walking skeletons \n Choices (e7/e8)");
        int room = 6;
        switch (direction) {
            case 'n':
            case 's':
            case 'e':
            case 'w':
            default:
                System.out.println("Invalid direction");
        }
        return room;
    }

    public static int parlor(char direction) {
        System.out.println("You are in the parlor\n It contains : treasure chest\n Choices (w6/s4)");
        int room = 7;
        switch (direction) {
            case 'n':
            case 's':
            case 'e':
            case 'w':
            default:
                System.out.println("Invalid direction");
        }
        return room;
    }

    public static int secretRoom(char direction) {
        System.out.println("You are in the secret room\n It contains : piles of gold\n Choices (w6)");
        int room = 8;
        switch (direction) {
            case 'n':
            case 's':
            case 'e':
            case 'w':
            default:
                System.out.println("Invalid direction");
        }
        return room;
    }
}
