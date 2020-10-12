import java.util.*;
import java.text.SimpleDateFormat; 



public class main2
{
  String name;
  int bdate;
  int bmonth;
  int byear;
  double m_sal;
  int age;
  double a_sal;

public main2(String name, int bdate, int bmonth, int byear, double m_sal)
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

   public double sal(double m_sal)
   {
    double tax1;
     this.a_sal=m_sal*12.00;
     System.out.println("annual salary:" + this.a_sal);
     if(this.a_sal>=500000)
     {
       tax1=this.a_sal*0.2;
       System.out.println("Applicable tax amount:" + tax1);
     }
     else if(this.a_sal >=400000 && this.a_sal<500000)
     {
        tax1=(this.a_sal*0.15);
       System.out.println("Applicable tax amount:" + tax1);

     }
      else if(this.a_sal >=300000 && this.a_sal<400000)
     {
        tax1=this.a_sal*0.1;
       System.out.println("Applicable tax amount:" + tax1);

     }
      else if(this.a_sal >=200000 && this.a_sal<300000)
     {
        tax1=(this.a_sal*0.05);
       System.out.println("Applicable tax amount:" + tax1);
     }
    else
    {
      System.out.println(" Tax amount is NA");
    } 
     return this.a_sal;
    
   }

public void display()
{
  System.out.println("The name is:" + this.name + "\nThe age is:" + this.age);
}

 
  public static void main(String[] args) {
    main2 e= new main2("Shubham",29,01,2000,30000.00);
    
    e.cal(29,01,2000);
    e.display();
    e.sal(30000.00);
    
  }
}