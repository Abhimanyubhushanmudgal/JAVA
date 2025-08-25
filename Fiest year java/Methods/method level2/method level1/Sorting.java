

public class Sorting {
    public static void main(String[] args) {
        int [] arr = {3,5,1,6,7,3,34};
        for(int i = 0; i<arr.length;i++)
        {
            if(arr[i]>arr[i+1])
            {
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
    }
    
}
