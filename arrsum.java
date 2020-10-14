import java.util.*;
public class arrsum{
  public static void main(String[] args) {
      int sum = 0;    
      int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter all the elements:");
        for(int i = 0; i < 5; i++)
        {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("Sum:"+sum);
  }
}