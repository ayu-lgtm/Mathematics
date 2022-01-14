import java.util.Scanner;

public class String_Palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i=0;
        int j=s.length()-1;
        boolean b=false;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
                b=true;
            }
            break;
        }
        if(b==false){
            System.out.print("Not Palindrome");
        }
        else{
            System.out.print("Palindrome");
        }
        sc.close();
        
    }
}
