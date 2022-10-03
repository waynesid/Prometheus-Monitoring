package com.WS.PrometheusMonitoring.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wayne Sidney
 * Created on {03/10/2022}
 */
@RestController
public class LogCreationController {
    public static Logger logger = LoggerFactory.getLogger(LogCreationController.class);

    @GetMapping("/mayday")
    public ResponseEntity<?> createLogs(){
        logger.warn("just checking");
        return ResponseEntity.ok().body("false alarm");
    }
}
