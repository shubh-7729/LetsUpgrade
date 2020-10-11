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