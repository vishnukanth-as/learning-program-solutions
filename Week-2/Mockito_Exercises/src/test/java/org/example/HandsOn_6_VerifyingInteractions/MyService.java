package org.example.VerifyingInteractions;

public class MyService {
    private final ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public void fetchData() {
        api.getData();
    }
}
