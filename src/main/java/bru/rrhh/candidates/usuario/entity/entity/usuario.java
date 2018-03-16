package bru.rrhh.candidates.usuario.entity.entity;
/**
 * Created by mcanovas on 16/03/2018.
 */


@Table(name = "USUARIO")
public class usuario {
    private Long id_log;
    private String nom_usu;
    private int clear_usu;
    private String dep_usu;
    private date lastacc_usu;


    @Id
    @SequenceGenerator(name = "SIF_AUDITORIA_SQ", sequenceName = "SIF_AUDITORIA_SQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SIF_AUDITORIA_SQ")
    @Column(name = "AUD_ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "AUD_OBSERVACIONES", nullable = false, length = 450)
    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}