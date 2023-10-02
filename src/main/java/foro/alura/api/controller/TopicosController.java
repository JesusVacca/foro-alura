package foro.alura.api.controller;


import foro.alura.api.topicos.ActualizarTopico;
import foro.alura.api.topicos.DatosTopicos;
import foro.alura.api.topicos.TopicoRepository;
import foro.alura.api.topicos.Topicos;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topico")
public class TopicosController {

    @Autowired
    private TopicoRepository topicoRepository;
    @PostMapping
    public void crearTopico(
            @RequestBody
            DatosTopicos topicos
            ){
        this.topicoRepository.save(new Topicos(topicos));

    }
    @PutMapping
    @Transactional
    public void actualizarTopico(
            @RequestBody
            ActualizarTopico topico
    ){
        Topicos topicos = this.topicoRepository.getReferenceById(topico.id());
        topicos.actualizarDatos(topico);
    }
}
