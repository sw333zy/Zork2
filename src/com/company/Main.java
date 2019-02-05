package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("choice (n2)");
        //System.out.println("What direction you wish to travel in");
        String choice = keyboard.next();

        while(){

            switch(choice){
                case "n2":
                    sou
                    break;
            }
        }
    }
    public static void foyer(String choice){
        System.out.println("You are in foyer \n It contains : dead scorpion\n ");
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
    }

    public static void frontRoom(){
        switch(){
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
        switch(){
            case 2:
                break;
            case 5:
                break;
        }
    }
    public static void kitchen(){
        switch(){
            case 2:
                break;
            case 7:
                break;
        }
    }
    public static void diningRoom(){
        library();
    }
    public static void vault(){

    }
    public static void parlor(){

    }
    public static void secretRoom(){

    }
}
