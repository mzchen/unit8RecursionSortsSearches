import java.util.ArrayList;

public class ListMethodsRunner
{
    public static void main(String[] args)
    {
        ArrayList<Integer> tempList = ListMethods.makeList(0);
        if (tempList.size() == 0)
        {
            System.out.println("The list is empty");
        }
        else
        {
            for (Integer i : tempList)
            {
                System.out.println(i);
            }
        }
        ArrayList<Integer> tempListb = ListMethods.makeList(100);
        for(int i = 1; i < 101;i++)
        {
            tempListb.set(i-1, i);
        }
        ArrayList<Integer> reverseredList = ListMethods.reverseList(tempListb);
        for(int x = 0; x < 100; x++)
        {
            System.out.println(reverseredList.get(x));
        }
    }
}