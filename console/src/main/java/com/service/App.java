package com.service;

import com.google.inject.Guice;

import java.util.Scanner;
import com.google.inject.Injector;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner S = new Scanner(System.in);
        Injector inject = Guice.createInjector(new ServiceModule());
        Service Cl = inject.getInstance(Service.class);
        Cl.add("Ross");
        Cl.add("Dan");
        Cl.add("Arin");
        Cl.add("Barry");
        System.out.println("1: Set \n2: Get \n3: GetAll");
        while(true)
        {
            int i = S.nextInt();
            if(i == 0)
                break;
            if(i == 1)
            {
                System.out.print("ID: ");
                int t = S.nextInt();
                System.out.print("Name: ");
                System.out.println(Cl.set(t, S.next()));
            }
            if(i == 2)
            {
                System.out.println("1: Get by name \n2: Get by ID");
                int t = S.nextInt();
                if(t == 1)
                {
                    String st = S.next();
                    System.out.println(Cl.get(st));
                }
                if(t == 2)
                {
                    int k = S.nextInt();
                    System.out.println(Cl.get(k));
                }
            }
            if(i == 3)
            {
                System.out.println(Cl.getAll());
            }
        }
    }
}
