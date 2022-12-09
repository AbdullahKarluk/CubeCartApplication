package com.unitedcoder.homework;

import java.util.Scanner;

public class JavaDecisionMakingStatementsCodeProject {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your marital status (Single or Married)");
        String status=input.nextLine();
        if (status.equalsIgnoreCase("single")){
            System.out.println("Enter your annual salary: ");
            int salary=input.nextInt();
            if (salary>=32000){
                double tax=32000*0.1+(salary-32000)*0.25;
                System.out.println("Your annual salary is :"+salary+"Your tax filing is"+status+
                                "Your tax percentage are 10% for 32000 and 25% for over 32000, Your total tax is:" + tax);
            } else {
                System.out.println("Your tax percentage are 10%, Your total tax is: "+salary*0.1);

            }

        }
        else if (status.equalsIgnoreCase("married")){
            System.out.println("Enter your annual salary: ");
            int salary=input.nextInt();
            if (salary<64000){
                System.out.println("Your tax percentage are 10%, Your total tax is: "+salary*0.1);
            } else if (salary>=64000) {
                double tax1=64000*0.1+(salary-64000)*0.25;
                System.out.println("Your annual salary is :"+salary+"Your tax filing is"+status+
                "Your tax percentage are 10% for 64000 and 25% for over 64000, Your total tax is:" + tax1);

            }
        }


    }
}
