
package sortingagorithms;

public class InsertionSorting {
    public void algoritm(){
        int arr[]={15,6,1,3,7,2};
        int n = arr.length; 
        
        for (int i=1; i<n; i++) 
        { 
            int currValue = arr[i]; 
            int j; 
            for(j=i-1;j>=0 && arr[j] > currValue;j=j-1) 
            { 
                arr[j+1] = arr[j]; 
            } 
            arr[j+1] = currValue; 
        } 
        
        for(int i=0;i<n;i++)
            System.out.print(arr[i]);
       
    }
    
}
