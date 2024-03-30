package com.example.iui.tourist.information;

public class InformationRequest {

    private String question;

    private String sourceLanguage;

    public InformationRequest(String question, String sourceLanguage) {
        this.question = question;
        this.sourceLanguage = sourceLanguage;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getSourceLanguage() {
        return sourceLanguage;
    }

    public void setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
    }
}
