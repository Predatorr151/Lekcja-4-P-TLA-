
public class petle
{
    public static void main()
    {
        int a=1;
        while(a<=10)
        {
            System.out.println(a+": Pętla while");
            a++;
        }
        System.out.println("*************************************");
        int i=11;
        do
        {
            System.out.println(i+": Pętla do while");//konkatenacja
            i++;
        }while(i<=10);
        i=i+2; // i+=2
        System.out.println("*************************************");

        for(int j=0;j<10;j+=3)
        {
            System.out.println(j+": Siema");
        }
        System.out.println("*************************************");
        for(int p=10;p>=0;p--)
        {
            System.out.println(p+"+ Siema1");
        }

    }

}

