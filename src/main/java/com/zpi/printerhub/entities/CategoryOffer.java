package com.zpi.printerhub.entities;

import javax.persistence.*;

@Entity
@Table(name = "CATEGORY_OFFER")
public class CategoryOffer {

    @Id
    private Long id;

    @MapsId
    @OneToOne
    @JoinColumn(name = "id_offer")
    private Offer offer;

    @MapsId
    @OneToOne
    @JoinColumn(name = "id_category")
    private Category category;

    public CategoryOffer() {
    }

    public Offer getOffer() {
        return offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
