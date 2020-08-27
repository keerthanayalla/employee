Package employee;

import java.util.Scanner;

 

public class Employee {

 

 int yrofjoin;

 String name;

 String address;

 

 public void getInput() {

 

  Scanner in = new Scanner(System.in);

  System.out.print("Enter the yrofjoin:: ");

  Yrofjoin = in.nextInt();

  System.out.print("Enter the name :: ");

  name = in.next();

  System.out.print("Enter the Adress:: ");

  address = in.next();

 }

 

 public void display() {

  System.out.println("Name\tYear of joining\tAddress);

  System.out.println(name"\t\t"+yrofjoin"\t\t"+address"\t");

 }

 

 public static void main(String[] args) {

 

  Employee e[] = new Employee[2];

  

  for(int i=0; i<2; i++) {

   

   e[i] = new Employee();

   e[i].getInput();

  }

  System.out.println("Name\tYear of joining\tAddress);

  for(int i=0; i<5; i++) {

   

   e[i].display();

  }

 }

}
