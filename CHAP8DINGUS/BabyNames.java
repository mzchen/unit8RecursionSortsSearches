// import java.io.File;
// import java.io.FileNotFoundException;
// import java.util.Scanner;
// 
// public class BabyNames
// {
//     public static final double LIMIT = 50;
// 
//     public static void main(String[] args) throws FileNotFoundException
//     {  
//         Scanner s = new Scanner(System.in);
//         System.out.println("What is your file name?");
//         String bumbee = s.next();
//         Scanner in = new Scanner(new File(bumbee));          
// 
//         RecordReader boys = new RecordReader(LIMIT);
//         RecordReader girls = new RecordReader(LIMIT);
// 
//         while (boys.hasMore() || girls.hasMore())
//         {
//             int rank = in.nextInt();
//             System.out.print(rank + " ");
//             boys.process(in);
//             girls.process(in);
//             System.out.println();
//         }
// 
//         in.close();
//     }
// }   
