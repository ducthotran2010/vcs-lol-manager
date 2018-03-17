/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginService;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author ThoDT
 */
public interface InterfaceLogin extends Remote {
    public boolean check(String user, String pass) throws RemoteException;    
}
