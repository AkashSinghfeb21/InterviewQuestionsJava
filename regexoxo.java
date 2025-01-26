import java.io.*;
import java.util.regex.Pattern;
public class regexoxo{
    public static void main(String[]args)throws Exception{

        InputStreamReader is = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(is);
        
        int x = Integer.parseInt(br.readLine());

        while(x>0){
            
            String n = br.readLine();

            try{
               Pattern.compile(n);
               System.out.println("Valid");
            }catch(Exception e){
                System.out.println("Invalid");
            }

            x--;
        }
    }
}