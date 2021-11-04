package models;

import java.awt.*;

public interface Picture {
    default String url() {
        throw new UnsupportedOperationException();
    };
    default Dimension dim() {
        throw new UnsupportedOperationException();
    };
    default PictureContent content() {
        throw new UnsupportedOperationException();
    };
}