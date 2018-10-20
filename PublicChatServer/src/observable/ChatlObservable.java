/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observable;

import java.rmi.RemoteException;
import java.util.ArrayList;
import observer.ChatObserver;


/**
 *
 * @author student
 */
public class ChatlObservable {
    private ArrayList<ChatObserver>observerList=new ArrayList<>();
    
    public void addChatObserver(ChatObserver chatObserver){
        observerList.add(chatObserver);
    }
    public void removeChatObserver(ChatObserver chatObserver){
        observerList.remove(chatObserver);
    }    
    public void notifyChatObservers(String message) throws RemoteException{
        for (ChatObserver observer : observerList) {
            observer.update(message);
        }
    }
}
