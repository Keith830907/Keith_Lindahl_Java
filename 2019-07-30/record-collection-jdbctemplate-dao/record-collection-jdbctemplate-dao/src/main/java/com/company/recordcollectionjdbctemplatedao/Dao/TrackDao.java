package com.company.recordcollectionjdbctemplatedao.Dao;

import com.company.recordcollectionjdbctemplatedao.model.Track;

import java.util.List;

public interface TrackDao {

    Track addTrack(Track track);

    Track getTrack(int id);

    List<Track> getAllTracks();

    List<Track> getTracksByAlbum(int albumId);

    void updateTrack(Track track);

    void deleteTrack(int id);
}

