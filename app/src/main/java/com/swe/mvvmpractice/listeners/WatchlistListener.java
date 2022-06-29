package com.swe.mvvmpractice.listeners;

import com.swe.mvvmpractice.models.TVShow;

public interface WatchlistListener {
    void onTVShowClicked(TVShow tvShow);
    void removeTVShowFromWatchlist(TVShow tvShow, int position);
}
