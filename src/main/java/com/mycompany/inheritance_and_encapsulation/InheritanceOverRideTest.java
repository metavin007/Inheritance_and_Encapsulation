
package com.mycompany.inheritance_and_encapsulation;

import java.util.Scanner;

class employee1
{
    protected float rate = 300.0f,work = 10.0f;
    int hour;
    float calOT()
            {
                return hour*rate/work;
            }
 }
    class daily_emp1 extends employee1
    {
        
    }
    class mothly_emp1 extends employee1
    {
        float pay,bonus;
        float calOT()
        {
            pay = hour*rate/work;
            if(hour>100)
            {
                pay += bonus;
                
            }
            return pay;
        }
    }

public class InheritanceOverRideTest 
{

    public static void main(String[] args) 
    {
      Scanner scan = new Scanner(System.in);
        System.out.print(" Enter total OT hour : ");
        employee1 emp1 = new employee1();
        emp1.hour = scan.nextInt();
        System.out.println("=================  Employee1  ============================");
        System.out.println(" hour = " + emp1.hour + " \nrate = " + emp1.rate
       + " \nwork = " + emp1.work + " \nand = hour*rate/work = " + emp1.calOT());
        
        System.out.println("=================  daily_emp1  ============================");
        daily_emp1 emp2 = new daily_emp1();
        emp2.hour = emp1.hour;
        System.out.print(" Enter total OT rate : ");
        emp2.rate = scan.nextFloat();
        System.out.println(" hour = " + emp2.hour + " \nrate = " + emp2.rate
       + " \nwork = " + emp2.work + " \nand = hour*rate/work = " + emp2.calOT());
        
       System.out.println("=================  monthly_emp1  ============================");
        mothly_emp1 emp3 = new mothly_emp1();
        emp3.hour = emp1.hour;
        emp3.rate = emp2.rate;
        System.out.print(" Enter OT Bonus : ");
        emp3.bonus = scan.nextFloat();
        System.out.println(" hour = " + emp3.hour + " \nrate = " + emp3.rate
       + " \nwork = " + emp3.work + " \nand = pay = " + emp3.calOT()); 
    }
    
    
}
