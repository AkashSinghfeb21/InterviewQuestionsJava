public class Triangle {
    public void printTriangle(int n){
        for(int i=n;i>=0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<2*(n-i);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        new Triangle().printTriangle(4);
    }  
} 
