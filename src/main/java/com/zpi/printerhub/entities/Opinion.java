package com.zpi.printerhub.entities;

import javax.persistence.*;

@Entity
@Table(name = "OPINION")
public class Opinion {

    @Id
    @GeneratedValue
    @Column(name = "id_opinion")
    private Long idOpinion;

    @Column(name = "description")
    private String description;

    @Column(name = "opinion_type")
    private int opinionType;

    @Column(name = "is_deleted")
    private boolean isDeleted;

    @OneToOne
    @JoinColumn(name = "id_giver")
    private User giver;

    @OneToOne
    @JoinColumn(name = "id_taker")
    private User taker;

    public Opinion() {
    }

    public Long getIdOpinion() {
        return idOpinion;
    }

    public void setIdOpinion(Long idOpinion) {
        this.idOpinion = idOpinion;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getOpinionType() {
        return opinionType;
    }

    public void setOpinionType(int opinionType) {
        this.opinionType = opinionType;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public User getGiver() {
        return giver;
    }

    public void setGiver(User giver) {
        this.giver = giver;
    }

    public User getTaker() {
        return taker;
    }

    public void setTaker(User taker) {
        this.taker = taker;
    }
}
