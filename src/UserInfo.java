import java.util.*;
public class UserInfo {
public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.print("what's your name?");
	  String name = sc.nextLine();
	  
	  System.out.print("How old?");
	  int age = sc.nextInt();
	  sc.nextLine();
	  
	  System.out.print("What's your height?");
	  double height = sc.nextDouble();
	  
	  System.out.print("What's your Wheight?");
	  double weight = sc.nextDouble();
	  
	  System.out.println("name:"+name+", age:"+age+", height:"+height+", weight"+weight);
}
} 