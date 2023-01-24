package api_cashier.api_cashier_model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.sun.org.apache.xpath.internal.operations.Bool;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="cashier")
public class DTO_Cashier implements Serializable {

    private static final long serialVersion = 1L;

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="photo")
    private Byte[] photo;
    @Column(name="address")
    private String address;
    @Column(name="cp")
    private Integer cp;
    @Column(name="lattitude")
    private Double lattitude;
    @Column(name="longitude")
    private Double longitude;
    @Column(name="balance")
    private Double balance;
    @Column(name="available")
    private Boolean available;
    @JsonBackReference
    @ManyToMany(cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    @JoinTable(name=)


}
