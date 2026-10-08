package at.technikum.presentation;

import at.technikum.business.model.Genre;
import at.technikum.business.model.MediaEntry;
import at.technikum.business.service.MediaService;

import java.util.List;
import java.util.UUID;

public class MediaController {
    private final MediaService mediaService;

    public MediaController(MediaService mediaService) {
        this.mediaService = mediaService;
    }

    public void addMedia(MediaEntry mediaEntry) {
        mediaService.addMedia(mediaEntry);
    }

    public List<MediaEntry> getAllMedia() {
        return mediaService.getAllMedia();
    }

    public MediaEntry getMediaById(UUID id) {
        return mediaService.getMediaById(id);
    }

    public List<MediaEntry> getMediaByGenre(Genre genre) {
        return mediaService.getMediaByGenre(genre);
    }

    public List<MediaEntry> getMediaByReleaseYear(int releaseYear) {
        return mediaService.getMediaByReleaseYear(releaseYear);
    }

    public List<String> getMediaTitles() {
        return mediaService.getMediaTitles();
    }

    public List<MediaEntry> searchMediaByTitle(String title) {
        return mediaService.searchMediaByTitle(title);
    }
}
