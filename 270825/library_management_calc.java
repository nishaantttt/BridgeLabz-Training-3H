import java.util.Scanner;

public class library_management_calc {
    public static String bookcategory(String book){
        
        
        
            if(book.equals("reg")){
                return "regular";
            }
            if(book.equals("ref")){
               return "reference";
            }
            if(book.equals("mag")){
                return "magazine";
            }
            else{
                return "invalid";
            }
    }
    public static int fine(int days){
        if (days == 0  ) return 0;
        if(days>0 && days<6){
            return days*10;
        }
        if(days>5 && days<11){
            return days*20;
        }
        if(days>=10){
            return days*50;
        }


        return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter no. of students : ");
        int totalstu = sc.nextInt();

        for(int i = 1 ; i<=totalstu ; i++){
            System.out.println("Enter no. of books borrowed by student  " + i +" :");
            int totalbooks = sc.nextInt();
            int tf=0;
            for(int j = 1 ; j <= totalbooks ; j ++){
                System.out.println("Enter book " + j + " type");
                String book = sc.next();
                System.out.println(bookcategory(book));
                System.out.println("how many days late ?");
                int days = sc.nextInt();
                tf+=fine(days);
                
            }
            System.out.println("total fine for student " + i + " = " +  tf );
            
        }
    }
}
