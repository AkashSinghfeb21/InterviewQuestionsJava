
import java.util.Scanner;

public class dupRemove {
   public static void removedup(String n){
    
    String arr [] = n.split(" ");
    
    int count = 0;
    
    for(int i=0;i<arr.length;i++){
        count = 1;
        for(int j=i+1;j<arr.length;j++){
            if(arr[i].equalsIgnoreCase(arr[j])){
                
                count++;

                arr[j] = "0";
            }    
        }
        if(!arr[i].equals("0")){
            System.out.print(arr[i]+" ");
        }
    }
   } 
   public static void main(String[]args){
    
    Scanner sc = new Scanner(System.in);
   
    int n = sc.nextInt();
    
    sc.nextLine();

    while(n>0){
       
        String s = sc.nextLine(); 
        
        removedup(s);

        System.out.println();

        n--;
    }
    
   }    
}

// Goodbye bye bye world world world
// Sam went went to to to his business
// Reya is is the the best player in eye eye game
// in inthe
// Hello hello Ab aB