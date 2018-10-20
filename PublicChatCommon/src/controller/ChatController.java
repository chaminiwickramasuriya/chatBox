/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.rmi.Remote;
import java.rmi.RemoteException;
import observer.ChatObserver;

/**
 *
 * @author student
 */
public interface ChatController extends Remote{
    public void addChatObserver(ChatObserver chatObserver )throws RemoteException;
    public void removeChatObserver(ChatObserver chatObserver )throws RemoteException;
    public void sendMessage(String message)throws RemoteException;
}
