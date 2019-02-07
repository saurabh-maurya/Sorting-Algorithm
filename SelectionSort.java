
package sortingagorithms;

public class SelectionSort {
    public void algoritm(){
        int arr[]={15,6,1,3,7,2};
        int n = arr.length;
        
        for(int i =0;i < n;i++){
            int minPos=i;
            for(int j = i;j<n;j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;    
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        
        for(int i=0;i<n;i++)
            System.out.print(arr[i]);
       
    }
}
