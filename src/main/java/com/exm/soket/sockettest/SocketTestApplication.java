package com.exm.soket.sockettest;

import com.corundumstudio.socketio.SocketIOServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import org.springframework.boot.autoconfigure.SpringBootApplication;
//@SpringBootApplication
public class SocketTestApplication {


    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(SocketTestApplication.class, args);
        SocketIOServer server = BaseSocket.getSocketServer();
        //check connection socket
        server.addConnectListener(socketIOClient -> {
            //listing  login
            server.addEventListener(Constants.Login, User.class, (socketIOClient1, user, ackRequest) -> {
                //send message  by session id user  connect
                server.getClient(socketIOClient.getSessionId()).sendEvent(Constants.MESSAGE, new ChatObject(socketIOClient.getSessionId().toString()
                        , user.email));
            });
        });

        server.start();
        Thread.sleep(Integer.MAX_VALUE);
        server.stop();
    }

}
