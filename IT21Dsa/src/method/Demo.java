
package method;

import java.util.Scanner;
public class Demo {
    static void message(String name , int age){
        System.out.println("Hello Guys, this is " + name + ". I am " + age + " years old!");
    }
      
    static int calculateAge(int currentYear, int birthyear){
        return currentYear - birthyear;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter your name: " );
         String name = sc.nextLine();
        
         System.out.print("Enter your age: " );
         int age = sc.nextInt();
        //message("Neziel Jade C. Soco", 17);
        
        message(name, age);
        
        int calculateage = calculateAge(2026, 2006); 
         if (age == calculateage) {
             System.out.println("Honest! ");
        } else {
             System.out.println("Liar!");
             
             
             
         
   
             
        }
         //
         System.out.print("Children of Marchilyn: " );
         //
         String[] Children = {"chen", "march", "hudson", "carl", "ryan", };
           for (int i = 0; i < 5; i++) {
            System.out.println(Children[i]);
            
            
        }
                 
      
         
         
    }
    
}
