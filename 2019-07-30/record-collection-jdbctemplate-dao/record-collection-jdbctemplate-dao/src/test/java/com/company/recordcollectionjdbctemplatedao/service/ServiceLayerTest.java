package com.company.recordcollectionjdbctemplatedao.service;

import com.company.recordcollectionjdbctemplatedao.Dao.AlbumDao;
import com.company.recordcollectionjdbctemplatedao.Dao.ArtistDao;
import com.company.recordcollectionjdbctemplatedao.Dao.LabelDao;
import com.company.recordcollectionjdbctemplatedao.Dao.TrackDao;
import com.company.recordcollectionjdbctemplatedao.DaoJdbcTemplate.AlbumDaoJdbcTemplateImpl;
import com.company.recordcollectionjdbctemplatedao.DaoJdbcTemplate.ArtistDaoJdbcTemplateImpl;
import com.company.recordcollectionjdbctemplatedao.DaoJdbcTemplate.LabelDaoJdbcTemplateImpl;
import com.company.recordcollectionjdbctemplatedao.DaoJdbcTemplate.TrackDaoJdbcTemplateImpl;
import com.company.recordcollectionjdbctemplatedao.model.Album;
import com.company.recordcollectionjdbctemplatedao.model.Artist;
import com.company.recordcollectionjdbctemplatedao.model.Label;
import com.company.recordcollectionjdbctemplatedao.model.Track;
import com.company.recordcollectionjdbctemplatedao.viewmodel.AlbumViewModel;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

public class ServiceLayerTest {


    ServiceLayer mockService;
    AlbumDao mockAlbumDao;
    ArtistDao mockArtistDao;
    LabelDao mockLabelDao;
    TrackDao mockTrackDao;

    @Before
    public void setUp() throws Exception {
        setUpAlbumDaoMock();
        setUpArtistDaoMock();
        setUpLabelDaoMock();
        setUpTrackDaoMock();

        mockService = new ServiceLayer(mockAlbumDao, mockArtistDao, mockLabelDao, mockTrackDao);

    }

    @Test
    public void saveFindAlbum() {
        AlbumViewModel avm = new AlbumViewModel();

        avm.setListPrice(new BigDecimal("14.99"));
        avm.setReleaseDate(LocalDate.of(1999, 05, 15));
        avm.setTitle("Greatest Hits");

        Artist artist = new Artist();
        artist.setInstagram("@RockStar");
        artist.setName("The GOAT");
        artist.setTwitter("@TheRockStar");
        artist = mockService.saveArtist(artist);
        System.out.println("Saved Artist: " + artist);

        avm.setArtist(artist);
        System.out.println("Saved Artist: " + artist);

        Label label = new Label();
        label.setName("Blue Note");
        label.setWebsite("www.bluenote.com");
        label = mockService.saveLabel(label);
        System.out.println("Saved Label: " + label);

        avm.setLabel(label);

        Track track = new Track();
        track.setRunTime(180);
        track.setTitle("Number 1 Hit!");
        List<Track> tList = new ArrayList<>();
        tList.add(track);
        for(Track t : tList) {
            System.out.println("Saved Track List: " + t);
        }

        avm.setTracks(tList);

        System.out.println("avm:  " + avm);

        avm = mockService.saveAlbum(avm);

        AlbumViewModel fromService = mockService.findAlbum(avm.getId());

        assertEquals(avm, fromService);
    }

    @Test
    public void findAlbum() {
    }

    @Test
    public void findAllAlbums() {
        List<AlbumViewModel> fromService = mockService.findAllAlbums();

        assertEquals(1, fromService.size());
    }

    @Test
    public void updateAlbum() {
    }

    @Test
    public void removeAlbum() {
    }

    @Test
    public void saveFindFindAllArtist() {

        Artist artist = new Artist();
        artist.setInstagram("@RockStar");
        artist.setName("The GOAT");
        artist.setTwitter("@TheRockStar");

        artist = mockService.saveArtist(artist);
        Artist fromService = mockService.findArtist(artist.getId());
        TestCase.assertEquals(artist, fromService);

        List<Artist> aList = mockService.findAllArtists();
        TestCase.assertEquals(1, aList.size());
        TestCase.assertEquals(artist, aList.get(0));
    }

    @Test
    public void saveLabel() {
    }

    @Test
    public void findLabel() {
    }

    @Test
    public void findAllLabels() {
    }

    @Test
    public void updateLabel() {
    }

    @Test
    public void removeLabel() {
    }


    // Helper methods
    private void setUpAlbumDaoMock() {
        mockAlbumDao = mock(AlbumDaoJdbcTemplateImpl.class);
        Album album = new Album();
        album.setId(1);
        album.setArtistId(45);
        album.setLabelId(10);
        album.setTitle("Greatest Hits");
        album.setListPrice(new BigDecimal("14.99"));
        album.setReleaseDate(LocalDate.of(1999, 05, 15));

        Album album2 = new Album();
        album2.setArtistId(45);
        album2.setLabelId(10);
        album2.setTitle("Greatest Hits");
        album2.setListPrice(new BigDecimal("14.99"));
        album2.setReleaseDate(LocalDate.of(1999, 05, 15));

        List<Album> aList = new ArrayList<>();
        aList.add(album);

        doReturn(album).when(mockAlbumDao).addAlbum(album2);
        doReturn(album).when(mockAlbumDao).getAlbum(1);
        doReturn(aList).when(mockAlbumDao).getAllAlbums();
    }

    private void setUpArtistDaoMock() {
        mockArtistDao = mock(ArtistDaoJdbcTemplateImpl.class);
        Artist artist = new Artist();
        artist.setId(45);
        artist.setInstagram("@RockStar");
        artist.setName("The GOAT");
        artist.setTwitter("@TheRockStar");

        Artist artist2 = new Artist();
        artist2.setInstagram("@RockStar");
        artist2.setName("The GOAT");
        artist2.setTwitter("@TheRockStar");

        List<Artist> aList = new ArrayList();
        aList.add(artist);

        doReturn(artist).when(mockArtistDao).addArtist(artist2);
        doReturn(artist).when(mockArtistDao).getArtist(45);
        doReturn(aList).when(mockArtistDao).getAllArtists();
    }

    private void setUpLabelDaoMock() {
        mockLabelDao = mock(LabelDaoJdbcTemplateImpl.class);
        Label label = new Label();
        label.setId(10);
        label.setName("Blue Note");
        label.setWebsite("www.bluenote.com");

        Label label2 = new Label();
        label2.setName("Blue Note");
        label2.setWebsite("www.bluenote.com");

        List<Label> lList = new ArrayList<>();
        lList.add(label);

        doReturn(label).when(mockLabelDao).addLabel(label2);
        doReturn(label).when(mockLabelDao).getLabel(10);
        doReturn(lList).when(mockLabelDao).getAllLabels();
    }

    private void setUpTrackDaoMock() {
        mockTrackDao = mock(TrackDaoJdbcTemplateImpl.class);
        Track track = new Track();
        track.setId(1);
        track.setAlbumId(1);
        track.setRunTime(180);
        track.setTitle("Number 1 Hit!");

        Track track2 = new Track();
        track.setAlbumId(1);
        track.setRunTime(180);
        track.setTitle("Number 1 Hit!");

        List<Track> tList = new ArrayList<>();
        tList.add(track);

        doReturn(track).when(mockTrackDao).addTrack(track2);
        doReturn(track).when(mockTrackDao).getTrack(1);
    }
}