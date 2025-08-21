package String_practice;

public class comparison{
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        if(str1.equals(str2)){
            System.out.println("str1 and str2 are equal using equals()");
        }
        for(int i = 0; i < str1.length(); i++){
            if(str1.charAt(i) == str2.charAt(i)){
                continue;
            } else {
                System.out.println("str1 and str2 are not equal at index " + i);
                break;
            }
        }
        System.out.println("str1 and str2 are equal using charAt() comparison");
    }
}