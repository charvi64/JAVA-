package advance;

public class ImageAdapter implements ImageViewer {
    private AdvancedImageViewer advancedImageViewer;

    public ImageAdapter(AdvancedImageViewer advancedImageViewer) {
        this.advancedImageViewer = advancedImageViewer;
    }

    @Override
    public void show() {
        if (advancedImageViewer instanceof PngShower) {
            advancedImageViewer.showPng();
        } else if (advancedImageViewer instanceof JpgShower) {
            advancedImageViewer.showJpg();
        }
    }
}

