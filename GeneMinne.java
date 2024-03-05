
/* 
Gene and Minne are playing with the words. Minne is always sure that his word will be equal to the Genes word, after moving few letters of the Genes word to the end.
Help Minne to solve the problem.

The first line of input contains the Genes word followed by Minne word. 
If it matches print true else print false


Sample Test Case - 1
input = abcde 
eabcd
output = true 


After performing the Genes word abcde-bcdea-cdeab-deabc-eabcd.


Sample Test Case - 2
input = abcdef
fedcba
output = false

Explanation -
After performing the Genes word  abcdef bcdefa cdefab defabc efabcd fabcde 
which doesnt match with the Minne word so the output is false 
*/
import java.util.Scanner;

public class GeneMinne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String genesWord = scanner.next();
        String minneWord = scanner.next();

        if (isMatch(genesWord, minneWord)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static boolean isMatch(String genesWord, String minneWord) {
        if (genesWord.length() != minneWord.length()) {
            return false;
        }

        String doubledGenes = genesWord + genesWord;

        return doubledGenes.contains(minneWord);
    }
}