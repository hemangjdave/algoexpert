package com.techrevolution.algorithms.easy.stringequality;

/**
 * Created By Hemang Dave
 * Date: 06/09/22
 * Time: 9:38 pm
 */
public class Program {
    public static void main(String[] args) {
        String s1 = "Hemang Dave";
        String s2 = "Hemang Dave";
        System.out.println(s1 == s2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        String s3 = "Hemang ";
        String s4 = "Dave";
        String s5 = s3 + s4;
        System.out.println(s5.hashCode());
        System.out.println(s5);
        System.out.println(s1 == s5);
        String s6 = new StringBuilder().append(s3).append(s4).toString();
        System.out.println(s1 == s6);
        System.out.println(s4.codePointAt(0));
        s4.lines().forEach(System.out::println);
        s5 = s5.intern();
        System.out.println(s5 == s1);
    }
}
