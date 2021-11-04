package services;

import models.PictureContent;

public interface ImageLoader {
    default PictureContent load(String pictureUrl){
        throw new UnsupportedOperationException("Loading image through interface is not allowed!");
    }
}