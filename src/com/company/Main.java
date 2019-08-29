package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String f = "Success";
        System.out.println(DuplicateEncoder.encode(f));
    }
}



class DuplicateEncoder {

    static String encode(String word) {
        String word1 = word.toUpperCase();

        String result = "";
        for (int i = 0; i < word1.length(); i++) {
            char c = word1.charAt(i);
            int counter = 0;
            for(int j = 0; j < word1.length(); j++)
            {
                char c2 = word1.charAt(j);
                if(c==c2){
                    counter +=1;
                }
            }
            if(counter == 1){
                result = result + "(";
            }else result = result + ")";
        }

        return result;
    }
}
