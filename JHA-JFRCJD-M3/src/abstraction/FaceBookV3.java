package abstraction;

public class FaceBookV3 extends FacebookV2{
    @Override
    public void addStory() {
        System.out.println("USER CAN ADD STORY ");
    }

    @Override
    public void sharePost() {
        System.out.println("USER CAN SHARE POST ON INSTA !!");
    }
}
