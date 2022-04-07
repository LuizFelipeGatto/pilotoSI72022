package br.edu.pds.piloto.controller;

import br.edu.pds.piloto.model.Estado;
import br.edu.pds.piloto.repository.EstadoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class EstadoController {

    @Autowired
    private EstadoRepositorio estadoRepositorio;

    @GetMapping("/cadastrarEstado")
    public ModelAndView cadastrar(Estado estado){
        ModelAndView mv = new ModelAndView("estado");
        mv.addObject("estado", estado);
        return mv;
    }

    @GetMapping("/listarEstado")
    public ModelAndView listar(){
        ModelAndView mv = new ModelAndView("estados");
        mv.addObject("estados", estadoRepositorio.findAll());
        return mv;
    }


    @PostMapping("/salvarEstado")
    public ModelAndView salvar(@Valid Estado estado, BindingResult result){
        if(result.hasErrors()){
            return cadastrar(estado);
        }

        estadoRepositorio.saveAndFlush(estado);

        return listar();
    }

}
