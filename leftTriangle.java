public class leftTriangle {
    public void printLeft(int n){
         for(int i=n;i>=0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println();
         }
    }
    public static void main(String[]args){
       new leftTriangle().printLeft(4);
    }
}
