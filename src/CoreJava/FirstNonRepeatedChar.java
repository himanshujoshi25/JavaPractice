package CoreJava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatedChar {

    public static void main(String[] args) {
        System.out.println(" Enter the input string :" );
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char ch = firstNonRepeatedCharacter(s);
        System.out.println("The first non repeated character is :  " + ch);
    }

    public static Character firstNonRepeatedCharacter(String str)
    {
        HashMap<Character,Integer> map = new LinkedHashMap<Character ,Integer>();
        Character ch;
        for (int i = 0; i < str.length(); i++)
        {
            ch = str.charAt(i);
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch) + 1);
            }
            else
            {
                map.put( ch , 1 ) ;
            }
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet())
        {
            if(entry.getValue() == 1)
                return entry.getKey();
        }
        return null;
    }
}
