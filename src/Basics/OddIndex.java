package Basics;
public class OddIndex {

    public static void main(String[] args) {

        String s = "Confused";
        char[] ch = s.toCharArray();

        int index = 0;
        char[] result = new char[s.length()/2];
        for(int i = 0; i < ch.length; i++){
            if(i % 2 != 0){
                result[index++] = ch[i];
            }
        }

        for(int i = 0; i < result.length; i++){
            System.out.print(" " + result[i]);
        }

    }
}
