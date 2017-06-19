
import java.util.Scanner;
public class main
{
    public static void main()
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Wpisz liczbe");
        int liczba=input.nextInt();
        if(liczba%2==0&&liczba%5==0)
            System.out.println("Liczba jest podzielna przez 2 i przez 5");
        else
            System.out.println("Liczba nie jest podzielna przez 2 i przez 5");

    }
}
