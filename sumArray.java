public class sumArray {
    public static void main(String[]args){
        int []arr={1,2,3,4,5};

        int t=0;

        for(int i=0;i<=arr.length-1;i++){
            t+=arr[i];
        }

        System.out.println(t);
    }
}
