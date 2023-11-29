// Create a abstract class employee, having its properties & abstract function for calculating net salary and displaying the information.  Drive manager & clerk class from this abstract class & implement the abstract method net salary and override the display method.

abstract class Employee
{
    String name;
    int id;
    double salary;
    abstract void netSalary();
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Salary: "+salary);
    }
}

class Manager extends Employee
{
    double bonus;
    Manager(String name, int id, double salary, double bonus)
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
    }
    void netSalary()
    {
        salary = salary + bonus;
    }
}

class Clerk extends Employee
{
    double overtime;
    Clerk(String name, int id, double salary, double overtime)
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.overtime = overtime;
    }
    void netSalary()
    {
        salary = salary + overtime;
    }
}

public class One
{
    public static void main(String[] args)
    {
        Manager m = new Manager("Rahul", 1, 10000, 5000);
        Clerk c = new Clerk("Rohit", 2, 5000, 1000);
        m.netSalary();
        c.netSalary();
        m.display();
        c.display();
    }
}