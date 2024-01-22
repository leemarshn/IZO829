package com.company.exceptions;

import java.util.ResourceBundle;

public class GeneralExceptions {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("Zoo");
        System.out.println(bundle.getString("hello")
                 + ", " + bundle.getString("open"));

    }
}
