import java.util.Arrays;
import java.util.Scanner;


class Employee{

               String name;
	       int age;
               int salary;

	       Employee(String name,int age,int salary){

                  this.name = name;
                  this.age = age;
                  this.salary = salary;

               }


               void display(){

                  System.out.println("Name :"+name+"Age:"+age+"Salary:"+salary);

               }


}


class employeeclass{
                 
                    public static void main(String args[]){
                    Scanner scanner = new Scanner(System.in);
                    
                    System.out.println("Enter Number Of Employees");
                    int n = scanner.nextInt();
                    Employee[] employees = new Employee[n];
               
                    for(int i = 0; i < n; i++) {
                    
                	System.out.println("Enter Details:");
                    	System.out.println("Enter Name:");
                        scanner.nextLine();
                    	String name = scanner.nextLine();
                    	System.out.println("Enter Age:");
                    	int age = scanner.nextInt();
                    	System.out.println("Enter Salary:");
                    	int salary = scanner.nextInt();
                    
             		employees[i] = new Employee(name,age,salary);
                  
                     }


                     Arrays.sort(employees,(e1,e2) -> Double.compare(e1.salary,e2.salary));


                     System.out.println("Employee sorted By Salary in Ascending Order :");


                     for(Employee e : employees){

                                 e.display();

                     }

               	     scanner.close();


                  }
 
     }