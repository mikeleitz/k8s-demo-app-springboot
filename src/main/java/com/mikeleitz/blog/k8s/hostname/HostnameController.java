package com.mikeleitz.blog.k8s.hostname;

import io.micrometer.core.annotation.Timed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;


/**
 * This controller prints out the hostname this application is running on.
 *
 * @author leitz
 */
@Timed("HostnameController")
@RestController()
@RequestMapping("/hostname")
public class HostnameController {
    private Logger _logger = LoggerFactory.getLogger(HostnameController.class);

    @GetMapping("")
    public String getServerHostname()  {
        String returnValue = null;

        try {
            returnValue = InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            returnValue = String.format("Unable to get hostname due to internal exception: %s", e.getMessage());
        }

        return returnValue;
    }

}
