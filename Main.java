public class Main
{
  String name;
  int age;
  String city;

public Main(String name, int age, String city)
{
  this.name=name;
  this.age=age;
  this.city=city;
}
public void display()
{
  System.out.println("The name is:" + this.name + "\nThe age is:" + this.age + "\nThe city is:"+ this.city + "\n\n");
}

 
  public static void main(String[] args) {
    Main e= new Main("Shubham",21,"Pune");
    e.display();
    Main  a = new Main("Mahi",39,"Ranchi");
    a.display();
  }
}