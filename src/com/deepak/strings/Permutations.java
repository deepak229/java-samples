package com.deepak.strings;

import java.util.HashSet;
import java.util.Set;

/**
 @author narasimha.s
 Date 1/18/22
 */
public class Permutations {

    Set<String> permutations = new HashSet<>();
    public void permutation(final String perm , final String word) {
        if (word.isEmpty()) {
            this.permutations.add(perm+word);
            return;
        }
        for (int i = 0; i < word.length(); i++) {
            permutation(perm+word.charAt(i), word.substring(0, i)+word.substring(i+1));
        }
    }

    public static void main(final String[] args) {
        final Permutations permutations = new Permutations();
        permutations.permutation("", "cc");
        System.out.println(permutations.permutations);
    }
}
