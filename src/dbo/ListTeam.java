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
public class ListTeam {
    private ArrayList<Team> list = new ArrayList<Team>();

    public ListTeam() {}
    
    public Vector getListPlayerVector() {
        Vector<Vector<String>> myVector = new Vector<>();
        for (Team thisTeam: list) {
            myVector.add(thisTeam.toVector());
        }
        return myVector;
    }
    public void loadFromSQL(AccessSQL mySQL) {
        list.clear();
        ResultSet myResult = mySQL.executeQuery("select * from Team");
        try {
            while (myResult.next()) {
                String name = myResult.getString(1);
                String ranking = myResult.getString(2);
                String founded = myResult.getString(3);
                String country = myResult.getString(4);
                list.add(new Team(name, ranking, founded, country));
            }
            myResult.close();
            myResult = mySQL.executeQuery("select team from Player WHERE  team NOT IN (select name from Team)");
            while (myResult.next()) {
                String name = myResult.getString(1);
                String ranking = "";
                String founded = "";
                String country = "VCS";
                list.add(new Team(name, ranking, founded, country));
            }
            myResult.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
}
