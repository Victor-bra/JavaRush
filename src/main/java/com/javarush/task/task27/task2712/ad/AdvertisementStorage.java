package com.javarush.task.task27.task2712.ad;

import java.util.ArrayList;
import java.util.List;

//Хранилище рекламных роликов(через Singleton)
public class AdvertisementStorage {
    private static AdvertisementStorage advertisementStorage;
    private final List<Advertisement> videos = new ArrayList<>();

    private AdvertisementStorage() {
        //Случайные видео
        Object someContent = new Object();
        videos.add(new Advertisement(someContent, "First Video", 500, 100, 3 * 60));    //width = 277
        videos.add(new Advertisement(someContent, "Second Video", 100, 10, 15 * 60));   //width = 11
        videos.add(new Advertisement(someContent, "Third Video", 400, 2, 10 * 60));     //width = 333
    }

    public static AdvertisementStorage getInstance() {
        if (advertisementStorage == null)
            return advertisementStorage = new AdvertisementStorage();
        else
            return advertisementStorage;
    }

    public List<Advertisement> list() {
        return videos;
    }

    public void add(Advertisement advertisement) {
        videos.add(advertisement);
    }
}
