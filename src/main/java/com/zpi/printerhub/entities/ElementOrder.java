package com.zpi.printerhub.entities;

import javax.persistence.*;

@Entity
@Table(name = "ELEMENT_ORDER")
public class ElementOrder {

    @Id
    @GeneratedValue
    @Column(name = "id_element_order")
    private Long idElementOrder;

    @Column(name = "description")
    private String description;

    @OneToOne
    @JoinColumn(name = "id_file")
    private File file;

    @OneToOne
    @JoinColumn(name = "id_order")
    private Order order;

    public ElementOrder() {
    }

    public Long getIdElementOrder() {
        return idElementOrder;
    }

    public void setIdElementOrder(Long idElementOrder) {
        this.idElementOrder = idElementOrder;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
