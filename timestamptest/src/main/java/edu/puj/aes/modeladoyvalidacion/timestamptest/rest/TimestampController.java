/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.puj.aes.modeladoyvalidacion.timestamptest.rest;

import edu.puj.aes.modeladoyvalidacion.timestamptest.entity.RespuestaDTO;
import java.util.Date;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sala-bd
 */
@RestController
@RequestMapping(name = "/api/serviceb")
public class TimestampController {

    @RequestMapping(name = "/timestamp", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    RespuestaDTO getTimestamp() {
        RespuestaDTO respuestaDTO = new RespuestaDTO();
        respuestaDTO.setFecha((new Date()).getTime());
        return respuestaDTO;
    }
}
