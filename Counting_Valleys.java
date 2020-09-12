import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Solution {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        
        int v = 0;     // # of valleys
        int lvl = 0;   // current level
        for(char c : s.toCharArray()){
            if(c == 'U') ++lvl;
            if(c == 'D') --lvl;
            
            // came UP to sea level
            if(lvl == 0 && c == 'U')
                ++v;
        }
        System.out.print(v);
    }
}