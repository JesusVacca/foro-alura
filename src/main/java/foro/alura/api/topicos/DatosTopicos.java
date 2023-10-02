package foro.alura.api.topicos;

import java.sql.Date;

public record DatosTopicos(
        String titulo,
        String mensaje,
        boolean statusTopico,
        String autor,
        String curso
) {
}
