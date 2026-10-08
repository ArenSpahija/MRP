package at.technikum.business.service;

import at.technikum.business.model.Genre;
import at.technikum.business.model.MediaEntry;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MediaServiceImpl implements MediaService {
    private final List<MediaEntry> mediaEntries;

    public MediaServiceImpl() {
        this.mediaEntries = new ArrayList<>();
    }

    @Override
    public void addMedia(MediaEntry mediaEntry) {
        mediaEntries.add(mediaEntry);
    }

    @Override
    public List<MediaEntry> getAllMedia() {
        return mediaEntries;
    }

    @Override
    public MediaEntry getMediaById(UUID id) {
        for (MediaEntry media : mediaEntries) {
            if (media.getId().equals(id)) {
                return media;
            }
        }

        return null;
    }

    @Override
    public List<MediaEntry> getMediaByGenre(Genre genre) {
        return mediaEntries.stream()
                .filter(media -> media.getGenres().contains(genre))
                .toList();
    }

    @Override
    public List<MediaEntry> getMediaByReleaseYear(int releaseYear) {
        return mediaEntries.stream()
                .filter(media -> media.getReleaseYear() == releaseYear)
                .toList();
    }

    @Override
    public List<String> getMediaTitles() {
        return mediaEntries.stream()
                .map(MediaEntry::getTitle)
                .toList();
    }

    @Override
    public List<MediaEntry> searchMediaByTitle(String title) {
        return mediaEntries.stream()
                .filter(media -> media.getTitle().toLowerCase()
                        .contains(title.toLowerCase()))
                .toList();
    }
}
