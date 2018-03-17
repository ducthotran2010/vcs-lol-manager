/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import LoginService.LoginRemote;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author ThoDT
 */
public class Service {
    public static void main(String[] args) {
        try {
            System.out.println("Server access DB...");
            LoginRemote db = new LoginRemote();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("rmi://localhost:1099/LoginServer", db);
            System.out.println("Server started");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
