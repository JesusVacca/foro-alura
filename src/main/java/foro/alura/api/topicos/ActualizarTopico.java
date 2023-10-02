package foro.alura.api.topicos;

import org.antlr.v4.runtime.misc.NotNull;

public record ActualizarTopico(
        @NotNull long id,
        String titulo,
        String mensaje,
        boolean statusTopico,
        String autor,
        String curso
) {
}
