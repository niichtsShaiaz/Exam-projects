/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPA2;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;

/**
 *
 * @author Mathias
 */
@Entity
@Inheritance 
public class PaperBook extends Book {
        private long shippingWeight;
        private boolean inStock;

    public long getShippingWeight() {
        return shippingWeight;
    }

    public void setShippingWeight(long shippingWeight) {
        this.shippingWeight = shippingWeight;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public PaperBook(long shippingWeight, boolean inStock, Long id, int isbn, String Author, String Title, Long price) {
        super(isbn, Author, Title, price);
        this.shippingWeight = shippingWeight;
        this.inStock = inStock;
    }

    public PaperBook() {
    }

    public PaperBook(long shippingWeight, boolean inStock) {
        this.shippingWeight = shippingWeight;
        this.inStock = inStock;
    }
    
}
