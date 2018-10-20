/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controlerImpl.ChatControllerImpl;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class StartServer {
    public static void main(String[] args) {
        try {
            Registry chatRegistry=LocateRegistry.createRegistry(5050);
            System.out.println("Stasrting server");
            chatRegistry.rebind("ChatServer", new ChatControllerImpl());
        } catch (RemoteException ex) {
            Logger.getLogger(StartServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
