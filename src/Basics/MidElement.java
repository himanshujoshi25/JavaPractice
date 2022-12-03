package Basics;
public class MidElement {

    public static void main(String[] args) {

        String str = "abcdef";

        char[] ch = str.toCharArray();

        int length = ch.length/2;

        if(length % 2 != 0){
            System.out.println(ch[length - 1] + "   " + ch[length]);
        }else{
            System.out.println(ch[length]);
        }
    }
}
