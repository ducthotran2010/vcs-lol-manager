/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbo;

import java.util.Vector;

/**
 *
 * @author ThoDT
 */
public class Player {
    private String name;
    private String ranking;
    private String team;
    private String role;

    public Player(String name, String ranking, String team, String role) {
        this.name = name;
        this.ranking = ranking;
        this.team = team;
        this.role = role;
    }

    Vector<String> toVector() {
        Vector<String> Detail = new Vector<String>();
        Detail.add(name);
        Detail.add(ranking);
        Detail.add(team);
        Detail.add(role);
        return Detail;
    }
    
}
