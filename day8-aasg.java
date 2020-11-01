import java.util.*;

 
public interface employee
{
    //Scanner sc=new Scanner(System.in)

public void getDetails();
public void displayDetails();
}

public class doctor implements employee{
    public String name;
    public int age;
   public int salary;
    public String designation;
  
    
    public void getDetails()
    {
  Scanner s= new Scanner(System.in);
  System.out.println("Enter name: ,Enter age: , Enter salary: ,Enter designation: ");
  name = s.nextLine();
  age = s.nextInt();
  salary = s.nextInt();
  designation = s.next();
    }
    
    public void displayDetails()
    {
  System.out.println("\nName:" + this.name + "\nage:" + this.age +"\nSalary:" + this.salary +"\nDesignation:" + this.designation + "\n");
    }
    
    
}

public class engineer implements employee{
    public String name;
    public int age;
   public int salary;
    public String designation;
    
    public void getDetails()
    {
  Scanner s= new Scanner(System.in);
  System.out.println("Enter name: ,Enter age: , Enter salary: ,Enter designation: ");
  name = s.nextLine();
  age = s.nextInt();
  salary = s.nextInt();
  designation = s.next();
    }
    
     public void displayDetails()
    {
  System.out.println("\nName:" + this.name + "\nage:" + this.age +"\nSalary:" + this.salary +"\nDesignation:" + this.designation + "\n");
    }
    
    
    
}

public class pilot implements employee{
    public String name;
    public int age;
   public int salary;
    public String designation;
    
    public void getDetails()
    {
  Scanner s= new Scanner(System.in);
  System.out.println("Enter name: ,Enter age: , Enter salary: ,Enter designation: ");
  name = s.nextLine();
  age = s.nextInt();
  salary = s.nextInt();
  designation = s.next();
    }
    
     public void displayDetails()
    {
  System.out.println("\nName:" + this.name + "\nage:" + this.age +"\nSalary:" + this.salary +"\nDesignation:" + this.designation + "\n");
    }
    
    
}

public class Main{


public static void main(String[] args) {
    System.out.println("Hello world!");
     doctor[] d1= new doctor[3];
     engineer[] e1= new engineer[3];
     pilot[] p1= new pilot[3];
     
    for(int i=0;i<3;i++){
    d1[i].getDetails();
    d1[i].displayDetails();
    }
    for(int i=0;i<3;i++){
    e1[i].getDetails();
    e1[i].displayDetails();
    }
    for(int i=0;i<3;i++){
    p1[i].getDetails();
    p1[i].displayDetails();
    }

}


}
