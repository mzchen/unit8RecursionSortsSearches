import java.util.*;

public class ListMethods
{
    public static ArrayList<Integer> makeList(int n)
    {
        ArrayList<Integer> tempList = null;
        if (n <= 0)  // The smallest list we can make
        {
            ArrayList<Integer> listy = new ArrayList<Integer>(0);
            return listy;

        }
        else        // All other size lists are created here
        {
            ArrayList<Integer> lister = new ArrayList<Integer>(n);
            return lister;

        }
    }

    public static ArrayList<Integer> reverseList(ArrayList<Integer> tList)
    {
        ArrayList<Integer> list = ListMethods.deepClone(tList); 
        if (list.size() <= 1)
        {
            return list;
            // Return the list as is – no need to reverse!
        }
        else
        {
            int n = list.size() -1;
            ArrayList<Integer> reversedList = new ArrayList<Integer>(list.size());
            while(n>=0)
            {
                reversedList.set(n, list.get(0));
                list.remove(0);
                n--;
            }
            // Use the solution to a smaller version of the problem
            // to solve the general problem
            return list;
        }
    }

    public static ArrayList<Integer> deepClone(ArrayList<Integer> tList)
    {
        ArrayList<Integer> list = new ArrayList<Integer>(); 
        for (Integer i : tList)
        {
            list.add(new Integer(i));
        }
        return list;
    }	
}