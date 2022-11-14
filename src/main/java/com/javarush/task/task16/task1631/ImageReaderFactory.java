package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    /*public static ImageReader getImageReader(ImageTypes imageTypes) {
        ImageReader reader;
        switch (imageTypes) {
            case BMP -> reader = new BmpReader();
            case JPG -> reader = new JpgReader();
            case PNG -> reader = new PngReader();
            default -> throw new IllegalArgumentException("Неизвестный тип картинки");
        }
        return reader;
    }*/
    public static ImageReader getImageReader(ImageTypes imageTypes) {
        if (imageTypes==null)
            throw new IllegalArgumentException("Неизвестный тип картинки");
        ImageReader reader;
        switch (imageTypes) {
            case BMP: reader = new BmpReader(); break;
            case JPG: reader = new JpgReader(); break;
            case PNG: reader = new PngReader(); break;
            default: throw new IllegalArgumentException("Неизвестный тип картинки");
        }
        return reader;
    }
}
