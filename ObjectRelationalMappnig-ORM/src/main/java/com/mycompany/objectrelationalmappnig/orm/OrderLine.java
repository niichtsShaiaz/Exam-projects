/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.objectrelationalmappnig.orm;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Mathias
 */
@Entity
public class OrderLine implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int quanitiy;
    @ManyToOne
    private ItemType itemType;
    @ManyToOne
    private Orderr order;

    OrderLine() {

    }

    public OrderLine(int quanitiy, ItemType itemType, Orderr order) {
        this.quanitiy = quanitiy;
        this.itemType = itemType;
        this.order = order;
    }

    public Orderr getOrder() {
        return order;
    }

    public void setOrder(Orderr order) {
        this.order = order;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public OrderLine(int quanitiy) {
        this.quanitiy = quanitiy;
    }

    public int getQuanitiy() {
        return quanitiy;
    }

    public void setQuanitiy(int quanitiy) {
        this.quanitiy = quanitiy;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderLine)) {
            return false;
        }
        OrderLine other = (OrderLine) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitys.OrderLine[ id=" + id + " ]";
    }
}
