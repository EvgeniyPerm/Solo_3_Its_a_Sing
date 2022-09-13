import java.util.Scanner;

public class Main {
    final static String STR_OPEN = "Open";
    final static String STR_TRASH = "Trash";
    static boolean isPalindrome(String word){
        int n=word.length();
        for (int i=0;i<n/2;i++){
            if (word.charAt(i)!=word.charAt(n-1-i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int countGood = 0;
        Scanner scanner = new Scanner (System.in);
        String[] words = new String[4];

        for (int i=0;i<4;i++){
            words[i]=scanner.nextLine();
            if (isPalindrome(words[i])) countGood++;
        };
        if (countGood==0){
            System.out.println(STR_TRASH);}
        else
            System.out.println(STR_OPEN);
    }

}