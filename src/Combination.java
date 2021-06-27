import java.util.Scanner;

public class Combination {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int fact, comb, numerator = 1, denominator = 1;
        System.out.print("C(n,r) Lütfen n'i giriniz: ");
        fact = s.nextInt();
        System.out.print("C(n,r) Lütfen r'yi giriniz: ");
        comb = s.nextInt();
        for (int i = 1; i <= fact;i++)
        {
            numerator *= i;
        }
        for (int i = 1; i <= comb; i++)
        {
            denominator *= i;
        }
        for (int i = 1; i <= fact - comb;i++)
        {
            denominator *= i;
        }
        if (numerator / denominator < 1)
        {
            System.out.println("Invalid Entry");
        }
        else
        {
            System.out.printf("Answer is: %d", numerator / denominator);
        }
    }

}
