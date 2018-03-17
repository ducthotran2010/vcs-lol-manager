/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author ThoDT
 */
public class ListPlayer {
    private ArrayList<Player> list = new ArrayList<Player>();

    public ListPlayer() {}
    
    public Vector getListPlayerVector() {
        Vector<Vector<String>> myVector = new Vector<>();
        for (Player thisPlayer: list) {
            myVector.add(thisPlayer.toVector());
        }
        return myVector;
    }
    
    public void loadFromSQL(AccessSQL mySQL) {
        list.clear();
        try {
            ResultSet myResult = mySQL.executeQuery("select * from Player");
            while (myResult.next()) {
                String name = myResult.getString(1);
                String ranking = myResult.getString(2);
                String team = myResult.getString(3);
                String role = myResult.getString(4);
                list.add(new Player(name, ranking, team, role));
            }
            myResult.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
