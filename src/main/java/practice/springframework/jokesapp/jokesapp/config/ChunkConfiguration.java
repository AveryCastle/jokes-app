package practice.springframework.jokesapp.jokesapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class ChunkConfiguration {

    public ChuckNorrisQuotes chuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }
}
