/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Matthew Cuza
 */
package org.example;
import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        System.out.println( "What is your age?" );
        int age = sc.nextInt();

        if(age < 16){
            System.out.println( "You are too young to drive." );
        }
        else
        {
            System.out.println( "You are old enough to drive" );
        }
    }
}
