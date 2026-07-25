package com.mastercard.stablecoin.exception;

import java.net.URI;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;

public final class ProblemDetailFactory {
    private ProblemDetailFactory() {
    }

    public static ProblemDetail create(HttpStatus status, String title, String detail) {
        ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(status, detail);
        problemDetail.setTitle(title);
        problemDetail.setType(URI.create("https://stablecoin.mastercard.com/problems/" + status.value()));
        return problemDetail;
    }
}
