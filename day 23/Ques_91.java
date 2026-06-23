//Write a program to Check anagram strings.
import java.util.*;

public class Ques_91 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the first string = ");
        String str1=sc.next();
        System.out.print("enter the second string = ");
        String str2=sc.next();
        char [] arr1 =str1.toCharArray();
        char [] arr2 =str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean x=true;

        if (str1.length()!=str2.length()){
            x=false;
        }
        else{
            for(int i=0; i<arr1.length;i++){
                if(arr1[i]!=arr2[i]){
                    x=false;
                    break;
                }
            }
        }
        if (x){
            System.out.println("anagram string");
        }
        else{
            System.out.println("not anagram string");
        }
        
    }
    
}
