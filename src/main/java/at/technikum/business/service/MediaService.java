package at.technikum.business.service;

import at.technikum.business.model.MediaEntry;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MediaService {
    private final List<MediaEntry> mediaEntries;

    public MediaService() {
        this.mediaEntries = new ArrayList<>();
    }

    public void addMedia(MediaEntry mediaEntry) {
        mediaEntries.add(mediaEntry);
    }

    public List<MediaEntry> getAllMedia() {
        return mediaEntries;
    }

    public MediaEntry getMediaById(UUID id) {
        for (MediaEntry media : mediaEntries) {
            if (media.getId().equals(id)) {
                return media;
            }
        }

        return null;
    }
}
