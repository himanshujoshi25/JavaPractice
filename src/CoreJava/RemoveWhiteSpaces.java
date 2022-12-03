package CoreJava;

import java.util.Scanner;
public class RemoveWhiteSpaces {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();
        //METHOD-1
        String removeWhiteSpaces = str.replaceAll("\\s","");
        System.out.println(removeWhiteSpaces);

        //METHOD-2
        char[] strArray = str.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < strArray.length; i++) {
            if ((strArray[i] != ' ') && (strArray[i] != '\t')) {
                stringBuffer.append(strArray[i]);
            }
        }
        String noSpaceStr = stringBuffer.toString();
        System.out.println(noSpaceStr);
    }
}
