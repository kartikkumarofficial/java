package Interface.Device;

public class SmartPhone implements Camera,MusicPlayer,Phone {
    @Override
    public void takePhoto() {
        System.out.println("Click");

    }

    @Override
    public void takeVideo() {

    }

    @Override
    public void playMusic() {

    }

    @Override
    public void Call() {

    }

    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.takePhoto();
    }
}
