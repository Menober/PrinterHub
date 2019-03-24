package com.zpi.printerhub.entities;

import javax.persistence.*;

@Entity
@Table(name = "ACCOUNT")
public class Account {

    @Id
    @GeneratedValue
    @Column(name = "id_account")
    private Long idAccount;

    @Column(name = "tokens")
    private int tokens;

    public Account() {
    }

    public Long getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(Long idAccount) {
        this.idAccount = idAccount;
    }

    public int getTokens() {
        return tokens;
    }

    public void setTokens(int tokens) {
        this.tokens = tokens;
    }
}
