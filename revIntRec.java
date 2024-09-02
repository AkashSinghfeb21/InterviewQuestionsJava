public class revIntRec {
    public static int rev(int n){
     if(n<10){
        return n;
     }

     System.out.print(n%10);//1234%10=

     return rev(n/10);
    }
    public static void main(String[]args){
         
        
        System.out.print(rev(1234));


    }
}
