package com.swe.mvvmpractice.responses;

import com.google.gson.annotations.SerializedName;
import com.swe.mvvmpractice.models.TVShowDetails;

public class TVShowDetailsResponse {

    @SerializedName("tvShow")
    private TVShowDetails tvShowDetails;

    public TVShowDetails getTvShowDetails() {
        return tvShowDetails;
    }
}
