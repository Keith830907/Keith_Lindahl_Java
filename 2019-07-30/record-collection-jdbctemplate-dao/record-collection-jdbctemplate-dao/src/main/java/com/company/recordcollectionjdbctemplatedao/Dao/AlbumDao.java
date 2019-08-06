package com.company.recordcollectionjdbctemplatedao.Dao;



import com.company.recordcollectionjdbctemplatedao.model.Album;

import java.util.List;

public interface AlbumDao {

    Album addAlbum(Album album);

    Album getAlbum(int id);

    List<Album> getAllAlbums();

    void updateAlbum(Album album);

    void deleteAlbum(int id);

}

