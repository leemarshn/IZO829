package com.company.coreApis;

public class TryTextBlocks {
    public static void main(String[] args) {

        //before text blocks
        String eyeTest = "\"Java Study Guide\"" +
                "\n by Scott & Jeanne";
        //System.out.println(eyeTest);

        String block = """  
                            doe \
                            deer""";

        System.out.println(block);


        var par = """
                My First Text Block
                Looks Cool,
                I'm not sure 
                How this works
               
                
                """;
        var par2 = par.stripIndent();


    }
}
