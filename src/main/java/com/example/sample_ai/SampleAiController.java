package com.example.sample_ai;

import com.example.sample_ai.assignment.SampleAiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/open-ai")
public class SampleAiController {

    private final SampleAiService aiService;

    @GetMapping("/user/{userName}/wishes")
    public String wishToUser(@PathVariable("userName") String name){
        return aiService.wishMessage(name);
    }

    @GetMapping("/languages/{language}/translator")
    public  String translate(@RequestParam("text") String text,@PathVariable("language") String language) {
        return aiService.translate(language, text);
    }
}
