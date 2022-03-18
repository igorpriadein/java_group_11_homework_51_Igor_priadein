package com.attractor.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Like {
    private User userWhoLiked;
    private Post likedPost;
    private LocalDate likeDate;

}
