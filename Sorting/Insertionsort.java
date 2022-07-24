import java.util.Scanner;
public class Insertionsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 12, 11, 13, 5, 6 };
        int d=arr.length;
        int i,j;
        for(i=1;i<d;i++)
        {
            j=i-1;
            int k=arr[i];

            while(j>=0 && k<arr[j])
            {
                arr[j+1]=arr[j];
                j-=1;
            }
            arr[j+1]=k;
        }
        
        System.out.println("sorted");
        for(i=0;i<d;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
