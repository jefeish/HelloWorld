package com.github.jefeish;

import com.launchdarkly.sdk.*;
import com.launchdarkly.sdk.server.*;
import com.github.jefeish.webserver.JettyServer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        int port = 8090; 
        JettyServer jettyServer = new JettyServer();

        if ( args.length > 0 ){
            port = Integer.parseInt(args[0]);
        }

        // start and initialize the WebServer
        jettyServer.start(port);
    }
}