package at.technikum.business.model;

import java.time.LocalDateTime;
import java.util.UUID;

public abstract class BaseEntity {

        private final UUID id;
        private final LocalDateTime createdAt;

        public BaseEntity() {
            this.id = UUID.randomUUID();
            this.createdAt = LocalDateTime.now();
        }

        public UUID getId() {
            return id;
        }

        public LocalDateTime getCreatedAt() {
            return createdAt;
        }
    }

