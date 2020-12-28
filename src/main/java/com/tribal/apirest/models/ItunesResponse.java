package com.tribal.apirest.models;

import java.util.List;

public class ItunesResponse {

    private Integer resultCount;
    private List<ItunesMusicResponse> results;

    public Integer getResultCount() {
        return resultCount;
    }

    public void setResultCount(Integer resultCount) {
        this.resultCount = resultCount;
    }

    public List<ItunesMusicResponse> getResults() {
        return results;
    }

    public void setResults(List<ItunesMusicResponse> results) {
        this.results = results;
    }



    
}
