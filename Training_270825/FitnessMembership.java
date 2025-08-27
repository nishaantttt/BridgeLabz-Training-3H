import java.util.*;

public class FitnessMembership {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("Enter Membership Type (1: Monthly, 2: Quarterly, 3: Yearly): 1");
            
            int type = sc.nextInt();
            
            int tc=0;
            
            switch(type){
                case 1:
                System.out.println("your plan is Monthly");
                tc=1*500;
                break;

                case 2:
                System.out.println("Quarterly");
                tc=4*500;
                break;

                case 3:
                System.out.println("yearly");
                tc=12*500;
                break;
                
                default:
                System.out.println("invalid");
            }
            System.out.println("Are you a senior citizen?: (y/n):");
            String sn = sc.next();
            float fp = tc;
            if(sn.equals("y")){
                System.out.println("you get 5% discount");
                fp=(float) (0.95*fp);
                System.out.println("you need to pay " + fp);
            }
            else{
                fp=tc;
            }
            
            

            System.out.print("\nDo you want to book another ticket? (yes=1 / no=0): ");
        } while (sc.nextInt() == 1);
    }
}
