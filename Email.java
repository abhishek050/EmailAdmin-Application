/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.emailadmin;
import java.util.Scanner;
/**
 *
 * @author ABHISHEK
 */
public class Email {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstname = sc.nextLine();
        System.out.println("Enter your last name: ");
        String lastname =sc.nextLine();
        Emailapp ep = new Emailapp(firstname,lastname);
        System.out.println(ep.showInfo());
    }
    
}
