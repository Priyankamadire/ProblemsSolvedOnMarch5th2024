
/*
 * User
 Mr. Bob is a Military Encoders. 
 Mr. Bob writes a word as shown below and then merges them. 
 Help Bob to write the code. 
 Mr. Bob will be given a word 'w' and a number 'n' 
Sample Test Case - 1
input = 
ABCDE
 2
output = ACEBD
    
    
This is How Bob writes the letters of the word 
A    C    E
    B    D
    
Now concatenate the two rows and ignore spaces in every row. We get ACEBD
    
    
Sample Test Case - 2
input = system
3
output = seytms
    
 s              e
    y       t        m
         s

Now concatenate the 3 rows we get seytms
 */
import java.util.Scanner;

public class BobMilitary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String w = sc.next();
        int n = sc.nextInt();
        char[] wordChars = w.toCharArray();
        int m = w.length();
        StringBuilder[] ans = new StringBuilder[m];
        for (int j = 0; j < m; j++) {
            ans[j] = new StringBuilder();
        }
        boolean flag = false;
        int i = 0;
        for (int j = 0; j < wordChars.length; j++) {
            ans[i].append(wordChars[j]);
            if (i == 0 || i == n - 1) {
                flag = !flag;
            }
            if (flag) {
                i++;
            } else {
                i--;
            }
        }
        for (StringBuilder sb : ans) {
            System.out.print(sb.toString());
        }
    }
}
