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
@Table(name = "SCHOOL")
@EntityListeners(AuditingEntityListener.class)
public class School {

    @Id
    @Column(name = "ID")
    private String Id;

    @Column(name = "ZH_NAME")
    private String zhName;

    @Column(name = "EN_NAME")
    private String enName;

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

    @OneToOne()
    @JoinColumn(name = "ID")
    private Address address;

    @OneToOne
    @JoinColumn(name = "ID")
    private SchoolInof schoolInof;

}
