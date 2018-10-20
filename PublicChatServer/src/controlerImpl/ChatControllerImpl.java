/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlerImpl;

import controller.ChatController;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import observable.ChatlObservable;
import observer.ChatObserver;

/**
 *
 * @author student
 */
public class ChatControllerImpl extends UnicastRemoteObject implements ChatController{
    private ChatlObservable chatlObservable=new ChatlObservable();
    public ChatControllerImpl()throws RemoteException{
        
    }
    @Override
    public void addChatObserver(ChatObserver chatObserver) throws RemoteException {
            chatlObservable.addChatObserver(chatObserver);
                
    }

    @Override
    public void removeChatObserver(ChatObserver chatObserver) throws RemoteException {
        chatlObservable.removeChatObserver(chatObserver);
    }

    @Override
    public void sendMessage(String message) throws RemoteException {
        chatlObservable.notifyChatObservers(message);
    }
    
}
