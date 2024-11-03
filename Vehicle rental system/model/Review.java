package model;

import java.time.LocalDateTime;

public class Review {
    User reviewer;
    LocalDateTime reviewedTime;
    int rating;
    String description;
    public Review(User reviewer, LocalDateTime reviewedTime, int rating, String description) {
        this.reviewer = reviewer;
        this.reviewedTime = reviewedTime;
        this.rating = rating;
        this.description = description;
    }
    @Override
    public String toString() {
        return "Review [reviewer=" + reviewer + ", reviewedTime=" + reviewedTime + ", rating=" + rating
                + ", description=" + description + "]";
    }

        
}
