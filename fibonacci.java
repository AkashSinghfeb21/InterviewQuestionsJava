public class fibonacci {
    public static void main(String[]args){
        int a=0,b=1,c=0;

        System.out.println(a+"\n"+b);
        for(int i=0;i<10;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
    }
}
