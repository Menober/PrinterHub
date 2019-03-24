package com.zpi.printerhub.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TOP_UP")
public class TopUp {

    @Id
    @GeneratedValue
    @Column(name = "id_top_up")
    private Long idTopUp;

    @Column(name = "due_date")
    private Date dueDate;

    @OneToOne
    @JoinColumn(name = "id_administrator")
    private Administrator administrator;

    @OneToOne
    @JoinColumn(name = "id_account")
    private Account account;

    public TopUp() {
    }

    public Long getIdTopUp() {
        return idTopUp;
    }

    public void setIdTopUp(Long idTopUp) {
        this.idTopUp = idTopUp;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Administrator getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
