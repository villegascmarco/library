/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.villegas.library.model;

import java.util.Date;

/**
 *
 * @author villegas
 */
public class Token {

    private int id;
    private String token;
    private String ip;
    private String location;
    private Date lastConnection;
    private String webBrowser;

    public Token() {
    }

    public Token(int id, String token, String ip, String location, Date lastConnection, String webBrowser) {
        this.id = id;
        this.token = token;
        this.ip = ip;
        this.location = location;
        this.lastConnection = lastConnection;
        this.webBrowser = webBrowser;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getLastConnection() {
        return lastConnection;
    }

    public void setLastConnection(Date lastConnection) {
        this.lastConnection = lastConnection;
    }

    public String getWebBrowser() {
        return webBrowser;
    }

    public void setWebBrowser(String webBrowser) {
        this.webBrowser = webBrowser;
    }

}
