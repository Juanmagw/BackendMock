package _2DAM.api_cashier_model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "client")
public class DTOClient implements Serializable {

    private static final long serialVersion = 1L;

    @Id
    @Column(name = "id")
    private Long id;

    @OneToMany(mappedBy = "client")
    List<DTOTransaction> transactions;

    @OneToMany(mappedBy = "client")
    List<DTOIncidence> incidences;
}
