package com.zpi.printerhub.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "FILE")
public class File {

    @Id
    @GeneratedValue
    @Column(name = "id_file")
    private Long idFile;

    @Column(name = "filepath")
    private String filepath;

    @Column(name = "addition_date")
    private Date additionDate;

    @Column(name = "is_deleted")
    private boolean isDeleted;

    @OneToOne
    @JoinColumn(name = "id_user")
    private User user;

    public File() {
    }

    public Long getIdFile() {
        return idFile;
    }

    public void setIdFile(Long idFile) {
        this.idFile = idFile;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public Date getAdditionDate() {
        return additionDate;
    }

    public void setAdditionDate(Date additionDate) {
        this.additionDate = additionDate;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
