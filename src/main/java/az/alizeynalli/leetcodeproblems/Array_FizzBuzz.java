package az.alizeynalli.leetcodeproblems;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/fizz-buzz/
public class Array_FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for(int i = 1; i <= n ; i++){
            String el = "";
            if(i % 3 == 0){
                el += "Fizz";
            }
            if(i % 5 == 0){
                el += "Buzz";
            }
            if(el == "") {
                el = String.valueOf(i);
            }
            result.add(el);
        }
        return result;
    }
}
