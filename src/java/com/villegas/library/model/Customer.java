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
public class Customer {

    private int id;
    private int status;
    private Person person;
    private UserPermits userPermits;

    public Customer() {
    }

    public Customer(int id, int status, Person person, UserPermits userPermits) {
        this.id = id;
        this.status = status;
        this.person = person;
        this.userPermits = userPermits;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public UserPermits getUserPermits() {
        return userPermits;
    }

    public void setUserPermits(UserPermits userPermits) {
        this.userPermits = userPermits;
    }

}
