package at.technikum.business.service;

import at.technikum.business.model.Genre;
import at.technikum.business.model.MediaEntry;

import java.util.List;
import java.util.UUID;

public interface MediaService {
    void addMedia(MediaEntry mediaEntry);

    List<MediaEntry> getAllMedia();

    MediaEntry getMediaById(UUID id);

    List<MediaEntry> getMediaByGenre(Genre genre);

    List<MediaEntry> getMediaByReleaseYear(int releaseYear);

    List<String> getMediaTitles();
}

