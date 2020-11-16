package com.github.jefeish;


// import com.launchdarkly.sdk.*;
// import com.launchdarkly.sdk.server.*;

/**
 * Hello world!
 *
 */
public class HelloWorld 
{
    public static void main( String[] args ) throws Exception
    {
        HelloWorld hw = new HelloWorld();
        hw.sayHello("");
    }

    public void sayHello(String str) {
        System.out.println("Hello "+ str);
    }
}