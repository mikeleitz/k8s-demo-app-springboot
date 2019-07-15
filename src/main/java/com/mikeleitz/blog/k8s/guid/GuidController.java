package com.mikeleitz.blog.k8s.guid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;


/**
 *
 * Controller responsible for giving the requester a guid.
 *
 * @author leitz
 */
@RestController()
@RequestMapping("/guid")
public class GuidController {
    private Logger _logger = LoggerFactory.getLogger(GuidController.class);

    @GetMapping("")
    public String getGuid()  {
        UUID uuid = UUID.randomUUID();

        return uuid.toString();
    }
}
