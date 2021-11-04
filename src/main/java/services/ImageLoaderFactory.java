package services;

public class ImageLoaderFactory {
    public static ImageLoader create(String imagePath){
        if (imagePath.endsWith("jpg") || imagePath.endsWith("jpeg")){
            return new JPGImageLoader();
        } else if (imagePath.endsWith("bmp")){
            return new BMPImageLoader();
        } else if (imagePath.endsWith("png")){
            return new PNGImageLoader();
        } else {
            throw new UnsupportedOperationException();
        }
    }
}