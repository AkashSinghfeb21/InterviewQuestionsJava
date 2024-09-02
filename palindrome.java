public class palindrome {
    public static boolean checkPalin(String a){
        
        String n = "";

        for(int i=a.length()-1;i>=0;i--){
            n+=a.charAt(i);
        }

        return (n.equals(a))?true:false; 

    }
    public static void main(String []args){

        System.out.println(checkPalin("racecar")?"It is a palindrome":"not palin");

    }
}
