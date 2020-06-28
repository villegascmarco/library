/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.villegas.library.model;

/**
 *
 * @author villegas
 */
public class UserPermits {

    private int id;
    private String email;
    private String psw;
    private String role;
    private Token tokens[];

    public UserPermits() {
    }

    public UserPermits(int id, String email, String psw, String role, Token[] tokens) {
        this.id = id;
        this.email = email;
        this.psw = psw;
        this.role = role;
        this.tokens = tokens;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Token[] getTokens() {
        return tokens;
    }

    public void setTokens(Token[] tokens) {
        this.tokens = tokens;
    }

}
