
package sortingagorithms;

public class BubbleSort {
    public void algoritm(){
        int arr[]={5,6,1,3,2,7};
        
        int n = arr.length;
        for(int i =0;i < n-1;i++){
            for(int j = 0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }   
        }
        
        for(int i=0;i<n;i++)
            System.out.print(arr[i]);
       
    }
}
