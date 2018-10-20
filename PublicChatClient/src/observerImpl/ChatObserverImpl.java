/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import observer.ChatObserver;
import view.ChatWindow;

/**
 *
 * @author student
 */
public class ChatObserverImpl extends UnicastRemoteObject implements ChatObserver{
    private ChatWindow chatWindow; 
    public ChatObserverImpl(ChatWindow chatWindow)throws RemoteException{
        this.chatWindow=chatWindow;
    }
    @Override
    public void update(String message) throws RemoteException {
        chatWindow.setMessage(message);
    }
    
}
