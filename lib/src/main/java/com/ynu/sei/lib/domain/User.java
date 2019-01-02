package com.ynu.sei.lib.domain;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;


@Entity
@Data
public class User {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String id;
    private String name;
    @Column(nullable = false, unique = true)
    private String phoneNumber;
    private String password;
    private LocalDateTime birthday;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private String gender;
    private String signature;

    public User() {
    }

    public User(LocalDateTime birthday, String name, String phoneNumber, String password, String gender, String signature) {
        this.birthday = birthday;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.gender = gender;
        this.signature = signature;
        this.createTime = LocalDateTime.now();
    }
}
