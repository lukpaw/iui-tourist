package com.example.iui.tourist;

import com.example.iui.tourist.information.InformationRequest;
import com.example.iui.tourist.information.InformationResponse;
import com.example.iui.tourist.information.InformationService;
import com.example.iui.tourist.translation.TranslationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tourist")
public class TouristController {

    private final TranslationService translationService;
    private final InformationService informationService;

    public TouristController(TranslationService translationService, InformationService informationService) {
        this.translationService = translationService;
        this.informationService = informationService;
    }

    @PostMapping("/information")
    public InformationResponse getInformation(@RequestBody InformationRequest request) {
        String translatedText;
        if (request.getSourceLanguage().equals("pl")) {
            translatedText = request.getQuestion();
        } else {
            translatedText = translationService.translate(request.getQuestion(), request.getSourceLanguage(), "pl");
        }
        List<String> results = informationService.getInformation(translatedText);
        return new InformationResponse(results);
    }
}
