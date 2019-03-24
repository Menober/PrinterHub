package com.zpi.printerhub.entities;

import javax.persistence.*;

@Entity
@Table(name = "ADMINISTRATOR")
public class Administrator {

    @Id
    @GeneratedValue
    @Column(name = "id_administrator")
    private Long idAdministrator;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    public Administrator() {
    }

    public Long getIdAdministrator() {
        return idAdministrator;
    }

    public void setIdAdministrator(Long idAdministrator) {
        this.idAdministrator = idAdministrator;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
