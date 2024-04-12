/*
    * The isDigits function checks whether a string "s" consists only of digits recursively.
It takes two parameters: the string "s" and an index indicating the current position in the string.
In the base case, if the index reaches the end of the string, the function returns true, indicating that all characters in the string are digits.
Otherwise, it checks if the character at the current index is a digit using the Character.isDigit() method.
If it's a digit, the function recursively calls itself with the next index.
If it encounters a non-digit character, it immediately returns false, indicating that the string contains non-digit characters.
    *
     time complexity O(n)
    */
public class prob8 {
    public static boolean digit(String s,int index){
        if(index==s.length()){
            return true;
        }
        char currentChar = s.charAt(index);
        if(Character.isDigit(currentChar)){
            return digit(s,index+1);

        }
        else{
            return false;}}
    public static void main(String[] args) {
        String s1 = "12345";
        String s2 = "12a45";


        System.out.println("String s1 consists only of digits: " + digit(s1, 0));
        System.out.println("String s2 consists only of digits: " + digit(s2, 0));
    }
}