package petslab;

import java.util.Scanner;
import  java.util.ArrayList;

public class PetsLab {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//naming scanner

        System.out.println("How many pets do you have?");//Capturing Number Of Pets
        int petNum;
        //String typePet = input.nextLine();
        String petName = input.next();
        petNum = input.nextInt();
        //String petType = input.next();

        //No Pets
        if (petNum == 0) {
            System.out.println("Im sorry to hear that. Pets are amazing!");
        }
        //Only one pet
        else if (petNum == 1) {
            //Capturing name
            System.out.println("What's your pet's name?:");
            petName = input.next();

            //Capturing type
            System.out.println("What type of pet is :" + petName);
            String petType = input.next();

            //PetList and format
            String title = String.format("%-10s %5s %10s", "PetNum", "PetName", "Animal");
            String underLines = String.format("%-10s %5s %10s", "---", "---", "---");
            String results = String.format("%-10s %5s %10s", petNum, petName, petType);
            System.out.println(title);
            System.out.println(underLines);
            System.out.println(results);


        } else if (petNum > 1) {
            for (int i = 1; i <= petNum; i++) {
                //Capturing name
                System.out.println("What's the name of your pet: " + i + "?");
                petName = input.next();

                //Capturing type
                System.out.println("What type of pet is :" + petName);
                String pets = input.next();


                //Pets List Format
                String title = String.format("%-10s %5s %10s", "PetNum", "PetName", "Animal");
                String underLines = String.format("%-10s %5s %10s", "-----", "-----", "-----");
                String results = String.format("%-10s %5s %10s", i, petName, pets);
                System.out.println(title);
                System.out.println(underLines);
                System.out.println(results);
            }
        }
    }
}

            /*input stored in an Array and loops
            ArrayList<String> pets = new ArrayList<String>();
            for (int i = 1; i <= petNum; i++) {
                if (petNum > 1) {
                    //Capturing name
                    System.out.println("What's the name of your pet: " + i + "?");
                    petName = input.next();

                    //Capturing type
                    System.out.println("What type of pet is :" + petName);
                    //String pets = input.next();
                }

                //Pets List Format
                String title = String.format("%-10s %5s %10s", "PetNum", "PetName", "Animal");
                String underLines = String.format("%-10s %5s %10s", "---", "---", "---");
                String results = String.format("%-10s %5s %10s", i, petName, pets);
                System.out.println(title);
                System.out.println(underLines);
                System.out.println(results);*/







