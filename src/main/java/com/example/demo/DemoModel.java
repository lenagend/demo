package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NonNull;

@Builder
@AllArgsConstructor
public class DemoModel {
    @NonNull
    private String id;
}
