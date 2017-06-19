import java.util.Scanner;
public class petlax2
{
    public static void main()
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Podaj A");
        int a=input.nextInt();
        System.out.println("Podaj B");
        int b=input.nextInt();

        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                System.out.print("*");//odpowiada za długość

            }
            System.out.println("");//odpowiada za wysokość
        }
        

        
        
        
         for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=b;j++)
            {
                System.out.print("("+i+"*"+j+")");//odpowiada za długość

            }
            System.out.println("");//odpowiada za wysokość
        }
        
    }

}
