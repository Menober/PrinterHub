package com.zpi.printerhub.entities;

import javax.persistence.*;

@Entity
@Table(name = "\"ORDER\"")
public class Order {

    @Id
    @GeneratedValue
    @Column(name = "id_order")
    private Long idOrder;

    @Column(name = "addition_information")
    private String additionInformation;

    @Column(name = "order_status")
    private int orderStatus;

    @OneToOne
    @JoinColumn(name = "id_offer")
    private Offer offer;

    @OneToOne
    @JoinColumn(name = "id_user")
    private User user;

    public Order() {
    }

    public Long getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Long idOrder) {
        this.idOrder = idOrder;
    }

    public String getAdditionInformation() {
        return additionInformation;
    }

    public void setAdditionInformation(String additionInformation) {
        this.additionInformation = additionInformation;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Offer getOffer() {
        return offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
