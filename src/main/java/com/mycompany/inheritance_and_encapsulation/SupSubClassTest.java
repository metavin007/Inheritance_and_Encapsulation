
package com.mycompany.inheritance_and_encapsulation;

import java.util.Scanner;

class employee
{
    protected float rate = 300.0f;
}
class daily_emp extends employee
{
    
}
class monthly_emp extends employee
{
    
}
public class SupSubClassTest 
{

    public static void main(String[] args) 
    {
        float r;
        employee emp1 = new employee();
        System.out.println("\"Employee\"\nRate par Day = " + emp1.rate + "BAHT");
        Scanner scan = new Scanner(System.in);
        System.out.print("\"Daily Employee\"\nEnter Rate : ");
        r = scan.nextFloat();
        
        daily_emp emp2 = new daily_emp();
        emp2.rate = r;
        System.out.println("Rate per Day = " + emp2.rate + "BAHT");
        
        System.out.print("\"Monthly Employee\"\nEnter Salary : ");
        r = scan.nextFloat();
        
        monthly_emp emp3 = new monthly_emp();
        emp3.rate = r;
        System.out.println("Rate per Day = " + emp3.rate + "BAHT");
    }
    
}
