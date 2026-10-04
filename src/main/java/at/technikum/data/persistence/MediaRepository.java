package at.technikum.data.persistence;

import at.technikum.business.model.MediaEntry;

import java.util.List;
import java.util.UUID;

public interface MediaRepository {
    void add(MediaEntry mediaEntry);

    List<MediaEntry> getAll();

    MediaEntry getById(UUID id);
}
