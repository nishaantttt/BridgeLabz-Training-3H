package Training_280825;

import java.util.HashMap;
import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a HashMap with String keys and Integer values
        HashMap<String, Integer> map = new HashMap<>();

        System.out.print("How many employees are there ? ");
        int a = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        // Take input from user
        for (int i = 0; i < a; i++) {
            System.out.print("Enter Employee "+(i+1)+" Name: ");
            String key = sc.nextLine();

            System.out.print("Enter basic salary: ");
            int value = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            map.put(key, value);
        }

        // Retrieve values
        System.out.print("\nEnter Employee name to check his salary: ");
        String name = sc.nextLine();

        if (map.containsKey(name)) {
            System.out.println(name + " -> " + map.get(name));
            
            int ts = (int) ((float) map.get(name)+0.2*map.get(name) + 0.1*map.get(name));
            
            if(ts>50000){
                int n=map.get(name);
                ts = (int) ((float)n+0.2*n + 0.1*n-0.1*n);
                System.out.print("Total in-hand salary including (20% HRA + 10$ DA) and deducting (10% income tax) is: " + ts);
            }
            else{
                System.out.print("Total in-hand salary including (20% HRA + 10$ DA) is: " + ts);
            }
            
        } else {
            System.out.println(name + " not found!");
        }



        // // Print all Employee-Salary pairs
        // System.out.println("\nAll employees");
        // for (String key : map.keySet()) {
        //     System.out.println(key + " -> " + map.get(key));
        // }

        sc.close();
    }
}

