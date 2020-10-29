
public class Testing
{
    public static void main(String[] args)
    {
        int i = 0;

        while(i < 5)
        {
            i++;
            System.out.print(i + " ");
        }

        while(i > 0)
        {
            i++;
        }

        System.out.println("This print will never be shown because the loop above is an infinite loop.");
    }
}
