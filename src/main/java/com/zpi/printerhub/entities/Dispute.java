package com.zpi.printerhub.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "DISPUTE")
public class Dispute {

    @Id
    @GeneratedValue
    @Column(name = "id_dispute")
    private Long idDispute;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "dispute_status")
    private int disputeStatus;

    @Column(name = "creation_date")
    private Date creationDate;

    @OneToOne
    @JoinColumn(name = "id_order")
    private Order idOrder;

    public Dispute() {
    }

    public Long getIdDispute() {
        return idDispute;
    }

    public void setIdDispute(Long idDispute) {
        this.idDispute = idDispute;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getDisputeStatus() {
        return disputeStatus;
    }

    public void setDisputeStatus(int disputeStatus) {
        this.disputeStatus = disputeStatus;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Order getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Order idOrder) {
        this.idOrder = idOrder;
    }
}
