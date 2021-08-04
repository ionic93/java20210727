package object2;

public class Ex7_4 {
    public static void main(String[] args) {
        MyTv t = new MyTv();

        t.setChannel(10);
        System.out.println("CH:"+t.getChannel());
        t.setChannel(20);
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());
    }
}
class MyTv {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prechannel;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 100;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 100;

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if(isPowerOn==true){
            prechannel = this.channel;
            this.channel = channel;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if(isPowerOn==true){
            this.volume = volume;
        }
    }

    public void gotoPrevChannel() {
        setChannel(prechannel);
    }
}
