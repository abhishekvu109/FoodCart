package com.abhi.foodcart.inventory;

import java.util.Deque;
import java.util.LinkedList;

public class Test {


    public static String removeContiguous(String s) {
        String output = "";
        Deque<Character> deque = new LinkedList<>();
        Character prev = s.charAt(0);
//        deque.offer(prev);
        boolean isSeq = false;
        for (int i = 1; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (!c.equals(prev) && !isSeq) {
                deque.offerLast(prev);
            } else if (!c.equals(prev)) {
                isSeq = false;
            } else {
                isSeq = true;
            }
            prev = c;
        }
        for (Character c : deque)
            output += c;

        return output;
    }

    public static void main(String args[]) {
        System.out.println(removeContiguous("acaaabbbacdddd"));
    }
}
