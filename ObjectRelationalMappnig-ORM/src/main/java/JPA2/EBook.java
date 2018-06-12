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
public class    EBook extends Book {
        private String downloadURL;
        private Long sizeMB;

    public String getDownloadURL() {
        return downloadURL;
    }

    public void setDownloadURL(String downloadURL) {
        this.downloadURL = downloadURL;
    }

    public Long getSizeMB() {
        return sizeMB;
    }

    public void setSizeMB(Long sizeMB) {
        this.sizeMB = sizeMB;
    }

    public EBook() {
    }

    public EBook(String downloadURL, Long sizeMB, Long id, int isbn, String Author, String Title, Long price) {
        super(isbn, Author, Title, price);
        this.downloadURL = downloadURL;
        this.sizeMB = sizeMB;
    }

    public EBook(String downloadURL, Long sizeMB) {
        this.downloadURL = downloadURL;
        this.sizeMB = sizeMB;
    }
        
        
    
}
