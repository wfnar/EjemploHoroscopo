package com.example.ejemploweb;

import com.example.ejemploweb.Controller.CalcularSigno;
import com.example.ejemploweb.Signo;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/signo")
public class SignoController {

    @GetMapping("/{dia}/{mes}")
    public ResponseEntity<String> signoZodiacal(@PathVariable(name = "dia") Integer numdia, @PathVariable(name = "mes") Integer nummes){
        ResponseEntity response =null;
        RespuestaFecha mensaje = null;
        try {
            String signo;
            CalcularSigno calcularSigno = new CalcularSigno();
            calcularSigno.calcularSigno(numdia, nummes);
            signo = calcularSigno.getSigno();
            mensaje = new RespuestaFecha(true,"La fecha es Valida el Signo es "+ signo);
            response = ResponseEntity.status(HttpStatusCode.valueOf(200)).body(mensaje);
        }catch (ExceptionFecha ef){
            mensaje = new RespuestaFecha(false,"La fecha es invalida");
            response = ResponseEntity.status(HttpStatusCode.valueOf(400)).body(mensaje);
        }

        return response;
    }

    @PostMapping
    public ResponseEntity<String> signo2(@RequestBody Signo signo){
        ResponseEntity response =null;
        RespuestaFecha mensaje = null;
        try {
            String signo2;
            CalcularSigno calcularSigno = new CalcularSigno();
            calcularSigno.calcularSigno(signo.getDia(), signo.getMes());
            signo2 = calcularSigno.getSigno();
            mensaje = new RespuestaFecha(true,"La fecha es Valida el Signo es "+ signo2);
            response = ResponseEntity.status(HttpStatusCode.valueOf(200)).body(mensaje);
        }catch (ExceptionFecha ef){
            mensaje = new RespuestaFecha(false,"La fecha es invalida");
            response = ResponseEntity.status(HttpStatusCode.valueOf(400)).body(mensaje);
        }
        return response;
    }

}
