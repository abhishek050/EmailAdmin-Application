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
public class Emailapp {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity = 500;
    private String alternatEmail;
    private int defaultPasswordlength;
    private int length = 10;
    private String email;
    private String companySuffix = "Accenture";
    boolean showInfo;
    
    
    public Emailapp(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;  
        //System.out.println("Name : "+this.firstName+" "+this.lastName);
        //call a method for the department - return the depatment
        this.department = setDepartment();
        //System.out.println("Department : "+this.department);
        //Call a method to return rander password
        this.password = randomPassword(8);
        System.out.println("Your password; "+this.password);
        
        //call a method to return email
        email = firstName.toLowerCase()+"_"+lastName.toLowerCase()+"@"+department+"."+companySuffix;
        //System.out.println("Your Email id: "+email);
    }
    
   // Ask for the department
    private String setDepartment(){
        System.out.println("Enter the department \n1 For Sales\n2 For Developement \n3 for Accounting \n4 For none");
        Scanner sc = new Scanner(System.in);
        int depChoice = sc.nextInt();
        if(depChoice == 1){ return "Sales";}
        else if(depChoice == 2){return "Developer";}
        else if(depChoice == 3){return "Accountant"; }
        else{ return " ";}
        
    }
    
    //Generate a rander password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXY1234567890!#$&";
        char[] password = new char[length];
        for(int i =0;i<length;i++){
            int rand=(int)(Math.random()*passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    
    //Set the mailboxCapacity 
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }
    
    //Set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternatEmail = altEmail;
        
    }
    
    // change the password
    public void changePassword(String password){
        this.password = password;
    }
    
    
    private String getAlternateEmail(){ return alternatEmail;}
    public int getMailboxCapacity(){return mailboxCapacity;}

    /**
     *
     * @return
     */
    public String showInfo(){
        return "DISPLAY NAME: "+firstName+" "+lastName+
                "\nCOMPANY EMAIL: "+email+
                "\nMAILBOC CAPACITY: "+ mailboxCapacity;
        
    }
    
    
}
