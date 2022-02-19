package com.example.demo.Entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "ADDRESS")
@EntityListeners(AuditingEntityListener.class)
public class Address {

    @Id
    @Column(name = "ID")
    private String Id;

    @Column(name = "POSTAL_CODE")
    private String postalCode;

    @Column(name = "COUNTY")
    private String county;

    @Column(name = "AREA")
    private String area;

    @Column(name = "ADDRESS")
    private String address;

    @CreatedBy
    @Column(name = "CREATE_BY")
    private String createBy;

    @CreatedDate
    @Column(name = "CREATE_DATE")
    private Date createDate;

    @LastModifiedBy
    @Column(name = "LAST_BY")
    private String lastBy;

    @LastModifiedDate
    @Column(name = "LAST_DATE")
    private Date lastDate;

    @OneToOne
    @JoinColumn(name = "ID")
    private School school;
}
