package com.company;
import java.util.Scanner;

 class Zork {
    public static void main(String[] args) {
        foyer();
    }
    public static void foyer(){
        System.out.println("ROOM 1 AND CONTAIN  IT CONTAIN DEAD SCORPION");
        System.out.println();
        System.out.println("door to  ROOM 2");
        front_room();
    }
    public static void front_room(){
        String answer="";
        System.out.println("ROOM 2 AND IT CONTAIN PIANO");
        System.out.println();
        System.out.println("you have currently three option to d/t room");
        System.out.println("which room you want to travel..(s1|w3|e4)");
        Scanner scanner=new Scanner(System.in);
        answer=scanner.nextLine();
        switch(answer){
            case "s1":
                foyer();
                break;
            case "w3":
                library();
                break;
            case "e4":
                kitchen();
                break;
            default:
                System.out.println("please enter the correct direction");
        }

    }
    public static void library(){
        String answer="";
        System.out.println("ROOM 3 AND CONTAIN SPIDERS");
        System.out.println();
        System.out.println("you have currently two option to d/t room");
        System.out.println("which room you want to travel..(e2|n5)");
        Scanner scanner=new Scanner(System.in);
        answer=scanner.nextLine();
        switch (answer){
            case "e2":
                front_room();
                break;
            case "n5":
                dining_room();
                break;
            default:
                System.out.println("please enter the correct direction");
        }
    }
    public static void kitchen(){
        String answer="";
        System.out.println("ROOM 4 AND CONTAIN KITCHEN");
        System.out.println();
        System.out.println("you have currently two option to d/t room");
        System.out.println("which room you want to travel..(w2|n7)");
        Scanner scanner=new Scanner(System.in);
        answer=scanner.nextLine();
        switch(answer){
            case "w2":
                front_room();
                break;
            case "n7":
                parlor();
                break;
            default:
                System.out.println("please enter the correct room direction");
        }
    }
    public static void dining_room(){
        String answer="";
        System.out.println("ROOM 5 AND CONTAIN DUST EMPTY BOX");
        System.out.println();
        System.out.println("you have currently ONE option to d/t room");

        while (true){
            System.out.println("which room you want to travel..(s3)");
            System.out.println("press 'q' to RETURN TO PREVIOUS ROOM");
            Scanner scanner=new Scanner(System.in);
            answer=scanner.nextLine();
            if(answer.equalsIgnoreCase("s3")){
                library();
            }
            else if(answer.equalsIgnoreCase("q")){
                library();
            }
            else {
                System.out.println("please enter the correct choice");
            }
        }
    }
    public static void valut(){
        String answer="";
        System.out.println("ROOM 6 AND CONTAIN 3 WALKING SKELETONS");
        System.out.println();
        System.out.println("you have currently TWO option to d/t room");
        while(true){
            System.out.println("which room you want to travel..(e7|e8)");
            System.out.println("press 'q' to RETURN TO PREVIOUS ROOM");
            Scanner scanner=new Scanner(System.in);
            answer=scanner.nextLine();
            int random=(int)(Math.random()*10+1);
            if((answer.equalsIgnoreCase("e7"))||(answer.equalsIgnoreCase("e8"))) {
                if (random >= 7) {
                    parlor();
                } else if (random < 7) {
                    secret_room();
                }
            }
            else if(answer.equalsIgnoreCase("q")){
                System.out.println("here is the previous ROOM");
            }
            else{
                System.out.println("please enter the correct choice");
            }
        }
    }
    public static void parlor(){
        String answer="";
        System.out.println("ROOM 7 AND CONTAIN TREASURE CHEST");
        System.out.println();
        System.out.println("you have currently TWO option to d/t room");
        while (true){
            System.out.println("which room you want to travel..(e6|s4)");
            System.out.println("press 'q' to RETURN TO PREVIOUS ROOM");
            Scanner scanner=new Scanner(System.in);
            answer=scanner.nextLine();
            if(answer.equalsIgnoreCase("e6")){
                valut();
            }
            else if(answer.equalsIgnoreCase("s4")){
                kitchen();
            }
            else if(answer.equalsIgnoreCase("q")){
                System.out.println("here is the privious room");
            }
            else {
                System.out.println("please enter the correct choice");
            }
        }
    }
    public static void secret_room(){
        String answer="";
        System.out.println("ROOM 8 AND CONTAIN PILES OF GOLD");
        System.out.println();
        System.out.println("you have currently ONE option to d/t room");
        while (true){
            System.out.println("which room you want to travel..(w6)");
            System.out.println("press 'q' to RETURN TO PREVIOUS ROOM");
            Scanner scanner=new Scanner(System.in);
            answer=scanner.nextLine();
            if(answer.equalsIgnoreCase("w6")){
                valut();
            }
            else if(answer.equalsIgnoreCase("q")){
                System.out.println("here is the privious room");
            }
            else {
                System.out.println("please enter the correct choice");
            }
        }
    }

}

