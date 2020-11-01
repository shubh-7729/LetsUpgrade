import java.util.Scanner;

class main1
{
public static void main(String args[])
{
     float java,ruby,pyhton,data_science,dart; 
     double tot, pert;
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter marks of five subjects:");
    System.out.print("Enter marks of java=");
    java=scanner.nextFloat();
    System.out.print("Enter marks of ruby=");
    ruby=scanner.nextFloat();
    System.out.print("Enter marks of pyhton=");
    pyhton=scanner.nextFloat();
    System.out.print("Enter marks of data_science=");
    data_science=scanner.nextFloat();
    System.out.print("Enter marks of dart=");
    dart=scanner.nextFloat();

    tot = java + ruby + pyhton + data_science + dart;
    pert = (tot / 500.0) * 100;
    System.out.println("Percentage = "+pert);

    if(pert>=80)
    {
      System.out.println("Your Grade is: A");
    }
    else if(pert>=70 && pert<=80)
    {
       System.out.println("Your Grade is: B");
    }
    else if(pert>=35 && pert<=60)
    {
      System.out.println("Your Grade is: C");
    }
    else
    {
      System.out.println("Your Grade is: F");
    }

   }
}



--------------------------------------------------------



import java.util.*;
import java.text.SimpleDateFormat; 



public class main2
{
  String name;
  int bdate;
  int bmonth;
  int byear;
  int m_sal;
  int age;
  int a_sal;

public main2(String name, int bdate, int bmonth, int byear, int m_sal)
{
  this.name=name;
  this.bdate=bdate;
   this.bmonth=bmonth;
    this.byear=byear;
    this.m_sal=m_sal;
    this.age=age;
    this.a_sal=a_sal;
}
  
  public int cal(int bdate, int bmonth, int byear)
   {
     int c_year;
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy");  
    Date date = new Date();  
    c_year=Integer.parseInt(formatter.format(date));
    System.out.println("current year:" + c_year);
    this.age=c_year-byear;
    return this.age;
   } 

   public int sal(int m_sal)
   {
    float tax;
     this.a_sal=m_sal*12;
     return this.a_sal;

     if(this.a_sal>=500000)
     {
       tax=float.parseFLOAT(this.a_sal*0.2);
       System.out.println("Applicable tax amount:" + tax);
     }
     else if(this.a_sal >=400000 && this.a_sal<500000)
     {
        tax=this.a_sal*0.15;
       System.out.println("Applicable tax amount:" + tax);

     }
      else if(this.a_sal >=300000 && this.a_sal<400000)
     {
        tax=this.a_sal*0.1;
       System.out.println("Applicable tax amount:" + tax);

     }
      else if(this.a_sal >=200000 && this.a_sal<300000)
     {
        tax=this.a_sal*0.05;
       System.out.println("Applicable tax amount:" + tax);

     }
    else{
      System.out.println(" Tax amount is NA");

    }    
   }

public void display()
{
  System.out.println("The name is:" + this.name + "\nThe age is:" + this.age  +  "\nThe age is:"+ this.a_sal + "\n\n");
}

 
  public static void main(String[] args) {
    main2 e= new main2("Shubham",29,01,2000,30000);
    e.cal(29,01,2000);
    e.sal(30000);
    e.display();
   /* Main  a = new Main("Mahi",39,"Ranchi");
    a.display();*/
  }
}