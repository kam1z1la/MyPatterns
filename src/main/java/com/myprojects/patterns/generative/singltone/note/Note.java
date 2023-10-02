package com.myprojects.patterns.generative.singltone.note;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Note {
    private Long id;
    private String title;
    private String content;
    private String access;
}