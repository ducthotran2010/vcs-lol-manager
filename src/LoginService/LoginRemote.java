/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginService;

import dbo.AccessSQL;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ThoDT
 */
public class LoginRemote extends UnicastRemoteObject implements InterfaceLogin {

    Hashtable<String, String> data = new Hashtable<>();
    public LoginRemote() throws RemoteException {
        AccessSQL mySQL = new AccessSQL();
        ResultSet myResult = mySQL.executeQuery("select * from Account");
        try {
            while (myResult.next()) {
                data.put(myResult.getString(1), myResult.getString(2));
            }
            myResult.close();
        } catch (SQLException ex) {
            Logger.getLogger(LoginRemote.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public boolean check(String user, String pass) throws RemoteException {
        if (data.containsKey(user))
            if (data.get(user).equals(pass))
                return true;
        return false;
    }
    
}
