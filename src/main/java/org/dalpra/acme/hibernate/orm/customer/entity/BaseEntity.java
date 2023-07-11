package org.dalpra.acme.hibernate.orm.customer.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(nullable = false)
    private LocalDateTime createAt;
    @Column(nullable = false)
    private LocalDateTime updateAt;
    @Column(nullable = false)
    private String createBy;
    @Column(nullable = false)
    private String updateBy;

    public BaseEntity() {
    }

    public BaseEntity( LocalDateTime createAt, LocalDateTime updateAt, String createBy, String updateBy) {
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.createBy = createBy;
        this.updateBy = updateBy;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

}
