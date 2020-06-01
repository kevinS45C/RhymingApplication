import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Rhyming re = new Rhyming();
        Vowel vl = new Vowel();
        String keyword = scan.nextLine();
        String[] subdivision = keyword.split("");
        vl.vowelContainer(subdivision);
        // re.Rhymes(keyword);
        scan.close();
    }
    
}