package com.devzuin.viralclips.controller;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ViralClipsController {

    @GetMapping("/response")
    public Map<String, String> getResponse() {
        return Collections.singletonMap("response", "rodrigo muito gay");
    }
}
