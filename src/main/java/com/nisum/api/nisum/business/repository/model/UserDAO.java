package com.nisum.api.nisum.business.repository.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="tb_users")
public class UserDAO {

    @Id
    @Column(name="id_user")
    private String userId;
    @Column(name="name")
    private String name;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "userDAO")
    private List<PhoneDAO> phones;
    @Column(name = "created")
    private String created;
    @Column(name = "modified")
    private String modified;
    @Column(name = "last_login")
    private String lastLogin;
    @Column(name = "token")
    private String token;
    @Column(name = "is_active")
    private Boolean isActive;
}
