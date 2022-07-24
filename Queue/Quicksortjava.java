public class Quicksortjava {
    public static void swap(int a,int b)
    {
        a=a+b;
        b=a-b;
        a=a-b;
    }
    public static void quicksort(int arr[], int low, int high){
        
        while(low<high)
        {
            int pi=partition(arr,low,high);
            quicksort(arr,low,pi-1);
            quicksort(arr,pi+1,high);
        }
    }
    public static int partition(int arr[],int low,int high){
        int pivot= arr[high];
        int i=low-1;
        for(int j= low;j<high;j++){
            if(arr[j]>pivot)
            {
                i++;
                swap(arr[i],arr[j]);
            }
        }
        swap(arr[i+1],arr[high]);
        return (i+1);

    }
    
    
    static void printArray(int[] arr, int size)
    {
        for(int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
            
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int n = arr.length;
        quicksort(arr,0,n-1);
        System.out.println("Sorted array: ");
        printArray(arr, n);

    }
}
