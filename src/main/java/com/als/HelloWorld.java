package com.als;

public class HelloWorld {
    
    public String handleRequest() {
        return "Hello World, Aws lambda!";
    }
    
    public String handleRequestWithName(String name) {
        return "Hello World, " + name;
    }
}
