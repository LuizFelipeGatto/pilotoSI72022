package br.edu.pds.piloto.controller;

import br.edu.pds.piloto.model.Estado;
import br.edu.pds.piloto.repository.EstadoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

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

}
