package com.company.coreApis;

public class ManipulateStrings {
    public static void main(String[] args) {
        var x = "Hello World";
        var z = " Hello World".trim();
        //System.out.println(x == z); // false

        var name = " My Name is Lee ";
        var name2 = name.strip();
        var name3 = name.trim();
        var name4 = name.stripLeading();

        //System.out.println(name.indexOf("l",3));

        System.out.println(name.length());
        System.out.println(name2.length());
        System.out.println(name3.length());
        System.out.println(name4.length());
    }
}
