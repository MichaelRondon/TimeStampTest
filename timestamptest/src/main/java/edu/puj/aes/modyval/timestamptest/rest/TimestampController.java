/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.puj.aes.modyval.timestamptest.rest;

import edu.puj.aes.modyval.timestamptest.jaxb.Timestamp;
import java.util.Date;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author sala-bd
 */
@Controller
@RequestMapping("/api")
public class TimestampController {

    @RequestMapping(value = "/timestamp",
             method = RequestMethod.GET
             ,produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public @ResponseBody
    Timestamp getTimestamp() {
        Timestamp timestamp = new Timestamp();
        timestamp.setFecha((new Date()).getTime());
        return timestamp;
    }
    
    @RequestMapping(value = "/timestamp",
             method = RequestMethod.GET
             ,produces = {MediaType.TEXT_HTML_VALUE, MediaType.TEXT_PLAIN_VALUE}
    )
    public @ResponseBody
    String getTimestampText() {
        Timestamp timestamp = this.getTimestamp();
        return String.valueOf(timestamp.getFecha());
    }
}
