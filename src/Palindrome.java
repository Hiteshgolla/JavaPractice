import java.util.*;
public class Palindrome {
    public static void main(String[] args){
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter the String:");
        String s = sc.next();
        System.out.println(s);
        char[] arrs = s.toCharArray();
        int n = s.length();
        char temp = ' ';
        int t = n;
        char[] ch = new char[n];
        for(int i = 0; i < n ; i++){
            temp = arrs[t - 1];
            ch[i] = temp;
            t--;

        }
        String s2 = String.valueOf(ch);
        System.out.println(s2);
        if(s.equals(s2)){
            System.out.println("the String is palindrome");
        }else{
            System.out.println("The string is not a palindrome");
            }
            sc.close();
        }
    }
    

