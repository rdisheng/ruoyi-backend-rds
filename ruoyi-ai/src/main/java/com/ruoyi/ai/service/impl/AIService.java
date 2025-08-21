package com.ruoyi.ai.service.impl;

// AIService.java

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ruoyi.ai.domain.dto.Message;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AIService {

    private final WebClient webClient;
    private final ObjectMapper objectMapper = new ObjectMapper();

    public AIService() {
        this.webClient = WebClient.builder()
                .baseUrl("https://www.gpt4novel.com/api/xiaoshuoai/ext/v1/chat/completions")
                .defaultHeader("Authorization", "Bearer 07e33ee6-f4a3-4065-9837-f5fc30cfe7c5")
                .build();
    }

    public Flux<String> chatStream(List<Message> messages) {
        Map<String, Object> body = new HashMap<>();
        body.put("model", "nalang-xl-10");
        body.put("messages", messages);
        body.put("stream", true);

        return webClient.post()
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(body)
                .retrieve()
                .bodyToFlux(String.class)
                .flatMap(line -> {
                    if (line.startsWith("data: ")) {
                        try {
                            String jsonStr = line.substring(6).trim();
                            if (jsonStr.equals("[DONE]")) return Flux.empty();
                            JsonNode node = objectMapper.readTree(jsonStr);
                            JsonNode contentNode = node.path("choices").get(0).path("delta").path("content");
                            if (!contentNode.isMissingNode()) {
                                return Flux.just(contentNode.asText());
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    return Flux.empty();
                });
    }
}
