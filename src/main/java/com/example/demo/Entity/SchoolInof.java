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
@Table(name = "SCHOOL_INFO")
@EntityListeners(AuditingEntityListener.class)
public class SchoolInof {

    @Id
    @Column(name = "ID")
    private String Id;

    @Column(name = "TEL")
    private String tel;

    @Column(name = "FAX")
    private String fax;

    @Column(name = "WEB")
    private String web;

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
