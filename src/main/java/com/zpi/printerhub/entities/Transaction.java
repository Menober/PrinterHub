package com.zpi.printerhub.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TRANSACTION")
public class Transaction {

    @Id
    @GeneratedValue
    @Column(name = "id_transaction")
    private Long idTransaction;

    @Column(name = "amount")
    private int amount;

    @Column(name = "due_date")
    private Date dueDate;

    @OneToOne
    @JoinColumn(name = "id_account_sender")
    private Account accountSender;

    @OneToOne
    @JoinColumn(name = "id_account_receiver")
    private Account accountReceiver;

    public Transaction() {
    }

    public Long getIdTransaction() {
        return idTransaction;
    }

    public void setIdTransaction(Long idTransaction) {
        this.idTransaction = idTransaction;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Account getAccountSender() {
        return accountSender;
    }

    public void setAccountSender(Account accountSender) {
        this.accountSender = accountSender;
    }

    public Account getAccountReceiver() {
        return accountReceiver;
    }

    public void setAccountReceiver(Account accountReceiver) {
        this.accountReceiver = accountReceiver;
    }
}
