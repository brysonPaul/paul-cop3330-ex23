/*
 *  UCF COP3330 Fall 2021 Assignment 23 Solution
 *  Copyright 2021 Bryson Paul
 */
package org.example;
import java.util.Scanner;
public class App {
    public static void main( String[] args ) {
        Scanner sc = new Scanner( System.in );
        Boolean yOrN = false;
        yOrN= strIO("Is the car silent when you turn the key? ", sc);
        if( yOrN ) {
            yOrN= strIO("Are the battery terminals corroded? ", sc);
            if(yOrN) {
                System.out.println("Clean terminals and try starting again.");
            }
            else {
                System.out.println("Replace cables and try again.");
            }
        }
        else{
            yOrN= strIO("Does the car make a slicking noise? ", sc);
            if(yOrN){
               System.out.println("Replace the battery.");
            }
            else{
                yOrN= strIO("Does the car crank up but fail to start? ", sc);
                if(yOrN){
                    System.out.println("Check spark plug connections.");
                }
                else{
                    yOrN= strIO("Does the engine start and then die? ", sc);
                    if(yOrN){
                        yOrN= strIO( "Does you car have fuel injection? ", sc);
                        if(yOrN){
                            System.out.println("Get it in for service.");
                        }
                        else {
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                    }
                    else{
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }
    }
    public static Boolean strIO(String input, Scanner sc){
        System.out.print(input);
        String output = sc.nextLine();
         if(output.toCharArray()[0] == 'y'){
             return true;
         }
         else return false;
    }
}
