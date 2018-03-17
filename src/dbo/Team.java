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
public class Team {
    private String name;
    private String ranking;
    private String founded;
    private String country;

    public Team(String name, String ranking, String founded, String country) {
        this.name = name;
        this.ranking = ranking;
        this.founded = founded;
        this.country = country;
    }
    Vector<String> toVector() {
        Vector<String> Detail = new Vector<>();
        Detail.add(name);
        Detail.add(ranking);
        Detail.add(founded);
        Detail.add(country);
        return Detail;
    }
    
}
