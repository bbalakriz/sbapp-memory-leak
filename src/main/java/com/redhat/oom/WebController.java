package com.redhat.oom;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @GetMapping("/")
    public String createOOM() {
        Main.main(null);
        return "No OOM";
    }
}