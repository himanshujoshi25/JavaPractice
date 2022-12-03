package Basics;
public class StringReverse {

    public static void main(String[] args) {

        String s = "himanshu";
        String reverse = "";

        for(int i = s.length() - 1; i >= 0; i--){
            reverse += s.charAt(i);
        }

        System.out.println(reverse);

        char[] characters = s.toCharArray();
        int left = 0;
        int right = characters.length - 1;

        while(left < right){

            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;

            left++;
            right--;
        }

        System.out.println(characters);
    }
}
