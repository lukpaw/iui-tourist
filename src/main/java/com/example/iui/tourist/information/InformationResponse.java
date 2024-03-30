package com.example.iui.tourist.information;

import java.util.List;

public class InformationResponse {

    private List<String> results;
    public InformationResponse(List<String> results) {
        this.results = results;
    }

    public List<String> getResults() {
        return results;
    }

    public void setResults(List<String> results) {
        this.results = results;
    }

}

