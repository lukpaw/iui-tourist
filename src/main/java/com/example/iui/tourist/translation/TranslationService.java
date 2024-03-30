package com.example.iui.tourist.translation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TranslationService {

    private final RestTemplate restTemplate;

    private final String apiUrl;

    public TranslationService(RestTemplate restTemplate, @Value("${translation.api.url}") String apiUrl) {
        this.restTemplate = restTemplate;
        this.apiUrl = apiUrl;
    }

    public String translate(String text, String sourceLanguage, String targetLanguage) {
        TranslationRequest request = new TranslationRequest(text, sourceLanguage, targetLanguage);
        TranslationResponse response = restTemplate.postForObject(apiUrl, request, TranslationResponse.class);
        return response.getTranslatedText();
    }

}
