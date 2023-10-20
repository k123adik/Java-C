//C. Check if the input is pangram or not. (Pangram is a sentence that contains all the alphabet
//from a-z)

import java.util.HashSet;
import java.util.Scanner;

public class C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if(isPangram(s) == true){
            System.out.println("String is Pangram");
        }
        else{
            System.out.println("String is not a Pangram");
        }
    }

    public static boolean isPangram(String s){
        HashSet<Character> hs = new HashSet<>();

        s = s.replaceAll(" ", "").toLowerCase();

        for(char c : s.toCharArray()){
            if(c >= 'a' && c <= 'z'){
                hs.add(c);
            }
        }
        if(hs.size() == 26){
            return true;
        }
        return false;
    }
}
