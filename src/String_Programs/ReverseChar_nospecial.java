package String_Programs;
/**
 * Revere character in string no special character
 *
 * Eg; Aru&**n
 * output : nur&**A
 *
 */
import java.util.*;

public class ReverseChar_nospecial {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        Stack<Character>stack = new Stack<>();

        for(char ch:str.toCharArray()){
            if(Character.isLetter(ch)){
                stack.push(ch);
            }
        }

        StringBuilder build = new StringBuilder();

        for(char ch : str.toCharArray()){
            if(Character.isLetter(ch)){
                build.append(stack.pop());
            }
            else{
                build.append(ch);
            }
        }


        System.out.println(build.toString());
    }

}