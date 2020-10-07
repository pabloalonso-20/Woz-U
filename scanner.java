import java.util.Scanner;


import java.time.LocalDate;
import java.util.*;

class Main {
  public static void main(String[] args) {

   

    Scanner scan = new Scanner(System.in);
    //prompt for data
    
    System.out.println("Input your name:");
    String name = scan.nextLine(); 

    System.out.println("Enter your email:");
    String email = scan.nextLine();



    //print statements
    
    System.out.println("\n");
    System.out.println("Name: " + name);
    System.out.println("Email: " + email);

    LocalDate today = LocalDate.now();
    System.out.println("Date: " + today);
    
  
  }
}
