/**
 *  Feb 16, 2021
 */
package javalab;

public class Feb16 {
    static class Employee{
        float salary=40000;
    }
    static class Developer extends Employee{
        int bonus=10000;
    }
    static class Tester extends Developer{
        int time_spent = 40;
    }
    public static void main(String[] args){
        //Single inheritance
        Developer p=new Developer();
        System.out.println("Programmer salary is:"+p.salary);
        System.out.println("Bonus of Programmer is:"+p.bonus);

        //Multilevel inheritance
        Tester tester = new Tester();
        System.out.println("Tester salary and and time spent: " + tester.salary + ", " + tester.time_spent);
    }
}
