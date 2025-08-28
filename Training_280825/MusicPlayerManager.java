package Training_280825;

public class MusicPlayerManager {
    public static void main(String[] args) {
        String[] playlist = {"Song1","Song2","Song3"};
        System.out.println("How do you want t play the songs? ");
        System.out.println("1.all\n2.index no. wise\n3.search a song by name");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        do{
            switch(n){
            case 1:
            for(int i = 0 ; i< playlist.length ; i++){
                System.out.println(playlist[i]+" is playing");  // print word
                try {
                    Thread.sleep(1000);  // wait 1 second (1000 ms)
                } catch (InterruptedException e) {
                        e.printStackTrace();
                }
            }
            break;

            case 2:
            for(int i = 0 ; i< playlist.length ; i++){
                System.out.println("Enter the index no. of song you want to be played");
                int idx = sc.nextInt();
                if(idx>=0 && idx<=playlist.length){
                    System.out.println(playlist[idx] + " is playing");
                    break;
                }
            }
            break;

            case 3:
            
            System.out.println("Enter the song you want to be played");  
            sc.nextLine(); 
            String song = sc.nextLine();     
            for(int j = 0 ; j< playlist.length ; j++){
                if(song.equals(playlist[j])){
                    System.out.println(playlist[j]+" is playing");
                    break;
                }
            }
            break;

            default:
            System.out.println("Enter a valid input!!");
            break;
        }
        System.out.println("Do you want to hear another song? (1.yes/0.No)");
        }while(sc.nextInt()==1);
    }
}
