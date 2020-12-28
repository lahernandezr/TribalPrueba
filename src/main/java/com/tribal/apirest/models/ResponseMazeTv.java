package com.tribal.apirest.models;

import java.util.List;

public class ResponseMazeTv {

    List<MazeTvResponse> shows;

    public List<MazeTvResponse> getShows() {
        return shows;
    }

    public void setShows(List<MazeTvResponse> shows) {
        this.shows = shows;
    }

}

/*
[
    {"score":17.458385,
        "show":
            {"id":139,"url":"http://www.tvmaze.com/shows/139/girls","name":"Girls","type":"Scripted","language":"English",
                "genres":["Drama","Romance"],
                "status":"Ended",
                "runtime":30,
                "premiered":"2012-04-15",
                "officialSite":"http://www.hbo.com/girls","schedule":{"time":"22:00","days":["Sunday"]},
                "rating":{"average":6.7},"weight":81,
                "network":{"id":8,"name":"HBO","country":{"name":"United States","code":"US","timezone":"America/New_York"}},
                "webChannel":null,"externals":
                {"tvrage":30124,"thetvdb":220411,"imdb":"tt1723816"},
                "image":
                    {
                        "medium":"http://static.tvmaze.com/uploads/images/medium_portrait/31/78286.jpg",
                        "original":"http://static.tvmaze.com/uploads/images/original_untouched/31/78286.jpg"
                    },
                "summary":"<p>This Emmy winning series is a comic look at the assorted humiliations and rare triumphs of a group of girls in their 20s.</p>",
                "updated":1600633829,"_links":{"self":{"href":"http://api.tvmaze.com/shows/139"},
                "previousepisode":{"href":"http://api.tvmaze.com/episodes/1079686"}}}},{"score":13.741969,
                "show":{"id":41734,"url":"http://www.tvmaze.com/shows/41734/girls","name":"GIRLS","type":"Scripted",
                "language":"Mongolian","genres":["Comedy"],"status":"Running","runtime":41,
                "premiered":null,"officialSite":null,"schedule":{"time":"","days":["Thursday"]},"rating":{"average":null},
                "weight":30,"network":{"id":1672,"name":"UBS","country":{"name":"Mongolia","code":"MN","timezone":"Asia/Ulaanbaatar"}},"webChannel":null,
                "externals":{"tvrage":null,"thetvdb":null,"imdb":"tt8709752"},
                "image":{"medium":"http://static.tvmaze.com/uploads/images/medium_portrait/191/478539.jpg",
                "original":"http://static.tvmaze.com/uploads/images/original_untouched/191/478539.jpg"},
                "summary":null,
                "updated":1556323042,
                "_links":{"self":{"href":"http://api.tvmaze.com/shows/41734"}
            }
        }
    }
    ]
       
    */
