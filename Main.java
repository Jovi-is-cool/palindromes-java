public class Main{
    public static void main(String[] args) {
        //palindrome problem #1
    String str = "blue";
    String reversed = "";
    for(int i = 0; i< str.length(); i++){
        reversed = reversed + str.substring(str.length() - i - 1, str.length()- i);
    }
    System.out.println(reversed);

    //palindrome problem #2
    String palin = str.substring(0, str.length()-1) + reversed;
    System.out.println(palin);

    //palindrome problem #3
    boolean isPalin = true;
    for(int i = 0; i < str.length()/2; i++){
        String first = str.substring(i, i+1);
        if(first.equals(str.substring(str.length() - i - 1, str.length() - i)) == false){
                isPalin = false;
           }
        
    }
    System.out.println(isPalin);
    }
}