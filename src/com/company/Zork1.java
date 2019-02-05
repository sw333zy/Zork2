package com.company;

import java.util.Scanner;

public class Zork1 {
    static Scanner keyboard = new Scanner(System.in);
    static String choice;

    public static void main(String[] args) {
        System.out.println("Enter room \nChoice(n1)");

        String choice;// = keyboard.next();
        char direction = '1';
        int room = 1;
        while (true) { //room
            System.out.print("\nEnter direction: ");
            direction = keyboard.next().charAt(0);
            System.out.print("Enter room: ");
            room = keyboard.nextInt();
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
        System.out.println("You are in foyer \n It contains : dead scorpion\n Choice (n2/x)");
        int room = 1;
        switch (direction) {
            case 'n':
                room = 2;
                break;
            case 'x':
                System.exit(0);
            default:
                System.out.println("Invalid direction");
        }
        return room;
    }

    public static int frontRoom(char direction) {
        System.out.println("You are in front Room \nIt contains : piano \nChoices (s1/w3/e4)");
        int room = 2;
        switch (direction) {
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
                System.out.println("Invalid direction");
        }
        return room;
    }

    public static int library(char direction) {
        System.out.println("You are in the library \nIt contains : spider \nChoices (e2/n5)");
        int room = 3;
        switch (direction) {
            case 'e':
                room = 2;
                break;
            case 'n':
                room = 5;
                break;
            default:
                System.out.println("Invalid direction");
        }
        return room;
    }

    public static int kitchen(char direction) {
        System.out.println("You are in the Kitchen \nIt contains : bats \nChoices (w2/n7)");
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
        System.out.println("You are in the Dining Room \nIt contains : dust empty box \nChoice (r3)");
        int room = 5;
        switch (direction) {
            case 's':
                room = 3;
                break;
            default:
                System.out.println("Invalid direction");
        }
        return room;
    }

    public static int vault(char direction) {
        System.out.println("You are in the vault\nIt contains : 3 walking skeletons \nChoices (e7/e8)");
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
                System.out.println("Invalid direction");
        }
        return room;
    }

    public static int parlor(char direction) {
        System.out.println("You are in the parlor\nIt contains : treasure chest\nChoices(w6/s4)");
        int room = 7;
        switch (direction) {
            case 's':
                room = 4;
                break;
            case 'w':
                room = 6;
                break;
            default:
                System.out.println("Invalid direction");
        }
        return room;
    }

    public static int secretRoom(char direction) {
        System.out.println("You are in the secret room\nIt contains : piles of gold\nChoices (w6)");
        int room = 8;
        switch (direction) {
            case 'w':
                room = 6;
                break;
            default:
                System.out.println("Invalid direction");
        }
        return room;
    }
}
