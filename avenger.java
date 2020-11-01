import java.util.*;

class avenger {
  String name;
  int age;
  String power;
  String weapon;
  String planet;


  public avenger(){
    this.name=name;
    this.age=age;
    this.power=power;
    this.weapon=weapon;
    this.planet=planet;
  }

public void getDetails(){
  Scanner s= new Scanner(System.in);
  System.out.println("Enter name:-");
  this.name = s.nextLine();
  System.out.println("Enter age:-");
  this.age = s.nextInt();
  System.out.println("Enter power:-");
  this.power = s.next();
  System.out.println("Enter weapon:-");
  this.weapon = s.next();
  System.out.println("Enter planet:-");
  this.planet = s.next();
}


public void displayDetails(){
  System.out.println("\nName:" + this.name + "\nage:" + this.age +"\nPower:" + this.power +"\nweapon:" + this.weapon +"\nplanet:" + this.planet + "\n");
}


  public static void main(String[] args) {
    System.out.println("Hello world!");
    avenger a1= new avenger();
    a1.getDetails();
    a1.displayDetails();

    avenger a2= new avenger();
    a2.getDetails();
    a2.displayDetails();

    avenger a3= new avenger();
    a3.getDetails();
    a3.displayDetails();

    avenger a4= new avenger();
    a4.getDetails();
    a4.displayDetails();

    avenger a5= new avenger();
    a5.getDetails();
    a5.displayDetails();
  }
}