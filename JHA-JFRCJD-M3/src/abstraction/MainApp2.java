package abstraction;

public class MainApp2 {
    public static void main(String[] args) {
        FaceBook fb = new FaceBookV3();
        fb.reactPost();
        fb.fbLive();
        fb.addStory();
        fb.sharePost();
    }
}
