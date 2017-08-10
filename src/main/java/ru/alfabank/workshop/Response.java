package ru.alfabank.workshop;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Response {
    @Singular
    private List<String> cards;
    private String token;
}
