public class regex {
    public static void main(String[]args){
        String a = "Aa$@*k";

        String x = a.replaceAll("[^a-zA-Z0-9]","");

        System.out.println(x);
    }
    
}
