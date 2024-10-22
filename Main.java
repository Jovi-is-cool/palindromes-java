public class Main{
    public static void main(String[] args) {
        //palindrome problem #1
    String str = "tacobilly";
    String reversed = "";
    for(int i = 0; i< str.length(); i++){
        reversed = reversed + str.substring(str.length() - i - 1, str.length()- i);
    }
    System.out.println(reversed);

    //palindrome problem #2
    String palin = str.substring(0, str.length()-1) + reversed;
    System.out.println(palin);

    //palindrome problem #3
    boolean isPalin = false;
    for(int i = 0; i< str.length()/2; i++){
        if(isPalin = true){}
            if(str.equals(reversed.substring(i, i + 1)) == true){
                isPalin = true;
            }    
    }
    System.out.println(isPalin);
    }
}