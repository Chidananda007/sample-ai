package com.example.sample_ai.assignment;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.V;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface SampleAiService {
  @SystemMessage("Your are a professional translator into {{language}}")
  @UserMessage("translate the following text {{text}}")
  String translate(@V("language") String language, @V("text") String text);
}
