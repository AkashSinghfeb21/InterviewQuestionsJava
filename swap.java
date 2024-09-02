public class swap{
    public static void main(String[]args){
        int a=10,b=11;
        
        System.out.println(a+"\n"+b);

        System.out.println("----------------");
        // b = a+b;
        // a = b-a;
        // b = b-a;
        
        b = a^b;
        a = b^a;
        b = b^a;

        System.out.println(a+"\n"+b);
    }
}