package com.ynu.sei.lib.domain;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
public class Image {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String id;
    private LocalDateTime createTime;
    private String uri;

    public Image() {
    }

    public Image(String uri) {
        this.uri = uri;
        this.createTime = LocalDateTime.now();
    }
}
