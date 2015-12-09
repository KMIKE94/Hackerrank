package Strings;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ReplaceString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        word = word.replaceAll("\\s", "");
        word = word.toLowerCase();
        
        char[] str = word.toCharArray();
        Arrays.sort(str);
        word = new String(str);
        StringBuilder noDupes = new StringBuilder();
        for(int i = 0; i < word.length(); i++){
        	String si = word.substring(i, i+1);
        	if(noDupes.indexOf(si) == -1)
        		noDupes.append(si);
        }
        
        
        if(noDupes.length() == 26)
            System.out.println("pangram");
        else
            System.out.println("not pangram");
        
        System.out.println(noDupes + "\n" + noDupes.length());
    }
}
