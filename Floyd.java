import java.util.Scanner;
 
class Floyd
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num = 1;
        
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();

        System.out.println("Floyd's triangle :-");
        for (int i = 1 ; i <= n ; i++ )
        {
            for (int j = 1 ; j <= i ; j++ )
            {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}