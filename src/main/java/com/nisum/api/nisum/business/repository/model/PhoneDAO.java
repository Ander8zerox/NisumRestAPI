package com.nisum.api.nisum.business.repository.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="tb_phones")
public class PhoneDAO {
    @ManyToOne
    @JoinColumn(name = "id_user", nullable=false)
    private UserDAO userDAO;
    @Id
    @Column(name = "number")
    private String number;
    @Column(name = "city_code")
    private String cityCode;
    @Column(name = "country_code")
    private String countryCode;
}
