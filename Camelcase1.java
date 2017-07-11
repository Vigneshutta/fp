import java.util.*;
 
public class CamelCase1{
 
    public static void main(String[] args) {
    //BufferedReader vc=new BufferedReader(new InputStreamReader(System.in));
        Scanner vc= new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = vc.nextLine();
        String result = "";
        char firstChar = input.charAt(0);
        result = result + Character.toUpperCase(firstChar);
        for (int i = 1; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            char previousChar = input.charAt(i - 1);
            if (previousChar == ' ') {
                result = result + Character.toUpperCase(currentChar);
            } else {
                result = result + currentChar;
            }
        }
        System.out.println(result);
    }
}
