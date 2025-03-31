public class insertion {
    public static void sort(int arr[]){
        int n= arr.length;
        for(int i=1; i<n; i++){
            int curr= arr[i];
            int pre = i+1;

            while(pre>=0 && arr[pre]>curr){
                arr[pre+1] = arr[pre];
                pre =pre-1;
            }
            arr[pre+1]= curr;
        }
            
        
    }
    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={3,56,4,1,24,5};
        //printarr(arr);
        sort(arr);
        printarr(arr);

    }
    
}
