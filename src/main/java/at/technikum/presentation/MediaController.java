package at.technikum.presentation;

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
}
