package nl.joeriabbo.spacecenter.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Index {
    @GetMapping("/")
    public String response() {
        return "Service running...";
    }
}