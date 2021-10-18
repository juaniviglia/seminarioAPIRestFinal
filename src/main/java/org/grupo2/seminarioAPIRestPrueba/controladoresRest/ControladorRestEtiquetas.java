package org.grupo2.seminarioAPIRestPrueba.controladoresRest;

import org.grupo2.controladores.ControladorEtiquetas;
import org.grupo2.exceptions.EtiquetaException;
import org.grupo2.vo.EtiquetaVO;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class ControladorRestEtiquetas {

    @PostMapping("/crearEtiquetas")
    @CrossOrigin(origins="https://localhost:3000/")
    public void crearEtiquetas(@RequestParam(name = "descripcion") String descripcion) throws EtiquetaException {
        ControladorEtiquetas.getInstance().crearEtiqueta(descripcion);
    }
    @RequestMapping("/getEtiquetas")
    @CrossOrigin(origins="https://localhost:3000/")
    public List<EtiquetaVO> getEtiquetas() throws EtiquetaException{
        return ControladorEtiquetas.getInstance().obtenerAllEtiquetas();
    }
}