package com.exm.soket.sockettest;

import com.corundumstudio.socketio.Configuration;
import com.corundumstudio.socketio.SocketIOServer;

/**
 * create base socket  singleton
 * and set config
 */
public class BaseSocket {
    private   static SocketIOServer server;
    public static   SocketIOServer getSocketServer(){
        if (server == null) {
            Configuration config = new Configuration();
            config.setHostname("localhost");
            config.setPort(9090);
             server = new SocketIOServer(config);
        }
        return server;
    }
}
