import java.util.*;
public class secondHighest{
    public static Integer[] bubbleSort(Integer[]arr){
        Integer temp = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
    public static void main(String[]args){
        Integer arr[]={1,1,2,3,4,5,6,7,8,8};

        HashSet<Integer> set = new HashSet<>(Arrays.asList(arr));

        Integer a[] = new Integer[set.size()];

        set.toArray(a);

        bubbleSort(a);
           
        System.out.println(a[1]);
        
    }
}