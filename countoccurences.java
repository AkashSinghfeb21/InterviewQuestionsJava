public class countoccurences {
    public static void count(String n){
        char arr[] = n.toCharArray();

        int count=0;

        for(int i=0;i<arr.length;i++){
         count =1;
         for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                count++;

                arr[j] = '0';
            }
         }
         if(arr[i]>'0'){
            System.out.println(arr[i]+":"+count);
         }
        }
    }
    public static void main(String[]args){
      String n = "Aakash";

      count(n.toUpperCase());
    }
}
