package com.tribal.apirest.models;

public class ResponseServices {
 
    ItunesResponse itunesResponse;
    ResponseMazeTv mazeTvResponse;
    PersonResponse wsldResponse;

    public ItunesResponse getItunesResponse() {
        return itunesResponse;
    }

    public void setItunesResponse(ItunesResponse itunesResponse) {
        this.itunesResponse = itunesResponse;
    }




    public ResponseMazeTv getMazeTvResponse() {
        return mazeTvResponse;
    }

    public void setMazeTvResponse(ResponseMazeTv mazeTvResponse) {
        this.mazeTvResponse = mazeTvResponse;
    }

    public PersonResponse getWsldResponse() {
        return wsldResponse;
    }

    public void setWsldResponse(PersonResponse wsldResponse) {
        this.wsldResponse = wsldResponse;
    }



    
}
