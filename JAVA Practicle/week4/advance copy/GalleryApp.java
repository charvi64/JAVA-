package advance;

public class GalleryApp {
    private ImageAdapter imageAdapter;

    public GalleryApp(ImageAdapter imageAdapter) {
        this.imageAdapter = imageAdapter;
    }

    public void show() {
        imageAdapter.show();
    }

    public static void main(String[] args) {
        AdvancedImageViewer pngViewer = new PngShower();
        ImageAdapter pngAdapter = new ImageAdapter(pngViewer);
        GalleryApp pngGallery = new GalleryApp(pngAdapter);
        pngGallery.show();

        AdvancedImageViewer jpgViewer = new JpgShower();
        ImageAdapter jpgAdapter = new ImageAdapter(jpgViewer);
        GalleryApp jpgGallery = new GalleryApp(jpgAdapter);
        jpgGallery.show();
    }
}

