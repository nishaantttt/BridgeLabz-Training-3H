package Training_270902.OOP_Practice;

public class oops {
    static int num;
    static {
        num =50;
        System.out.println("this is static");
    }
    {
        System.out.println("this is instance");
    }
    oops(){
        System.out.println("this is default");
    }
    static class newclass{
        int number = 70;
    }
    

}
