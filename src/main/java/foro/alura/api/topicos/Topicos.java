package foro.alura.api.topicos;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;


@Table(name = "topicos")
@Entity(name="Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topicos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titulo;
    private String mensaje;
    private LocalDate fechaCreacion;
    private boolean statusTopico;
    private String autor;
    private String curso;

    public Topicos(DatosTopicos topicos) {

        this.titulo = topicos.titulo();
        this.mensaje = topicos.mensaje();
        this.fechaCreacion = LocalDate.now();
        this.statusTopico = topicos.statusTopico();
        this.autor = topicos.autor();
        this.curso = topicos.curso();
    }

    public  Topicos actualizarDatos(ActualizarTopico topicos) {
        System.out.println(topicos);
        String data = topicos.titulo()+","+topicos.autor()+","+
                topicos.curso()+","+topicos.mensaje()+"";
        boolean validate = true;
        for (String item:
             data.split(",")) {
            if(item == null)validate=false;
        }
        if(validate){
            this.titulo = topicos.titulo();
            this.mensaje = topicos.mensaje();
            this.fechaCreacion = LocalDate.now();
            this.statusTopico = topicos.statusTopico();
            this.autor = topicos.autor();
            this.curso = topicos.curso();
        }
        return this;
    }

}
