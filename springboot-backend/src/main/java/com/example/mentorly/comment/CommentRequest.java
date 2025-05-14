package com.example.mentorly.comment;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class CommentRequest {
    @NotBlank(message = "Content can't be blank")
    private String content;
}
