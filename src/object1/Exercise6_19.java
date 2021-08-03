package object1;

class MyTv{
    private boolean isPowerOn;
    private int channel;
    private int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    @Override
    public String toString() {
        return "전원:" + isPowerOn + ", CH:" + channel + ", VOL:" + volume;
    }

    public void setChannel(int channel) {
        if(isPowerOn==true) {
            if (channel >= MAX_CHANNEL) channel = MIN_CHANNEL;
            else {
                this.channel=channel++;
            }
        }
    }

    public void setVolume(int volume) {
        if(isPowerOn==true) {
            if (volume < MAX_VOLUME) this.volume = volume++;
        }
    }

    void turnOnOff(){
        //(1) isPowerOn의 값이  true면 flase로, false면  true로 바꾼다.
        isPowerOn = !isPowerOn;
    }

    void volumeUp(){
        //(2) volume의 값이  MAX_VOLUME보다 작을 때만 값을 1 증가시킨다.
        if(isPowerOn==true) {
            if (volume < MAX_VOLUME) volume++;
        }
    }

    void volumeDown(){
        //(3) volume의 값이 MIn_VOLUME보다 클 때만 값을 1 감소시킨다
        if(isPowerOn==true) {
            if (volume > MIN_VOLUME) volume--;
        }
    }

    void channelUp(){
        //(4) channel의 값을 1증가시킨다
        //만약 channel이 MAX_CHANNEL이면 channel의 값을 MIn_CHANNEL로 바꾼다.
        if(isPowerOn==true) {
            if (channel >= MAX_CHANNEL) channel = MIN_CHANNEL;
            else channel++;
        }
    }

    void channelDown(){
        //(5) channel의 값을 1감소시킨다
        //만약 channel이 Min_CHANNEL이면 channel의 값을 Max_CHANNEL로 바꾼다.
        if(isPowerOn==true){
        if(channel <= MIN_CHANNEL) channel = MAX_CHANNEL;
        else channel--;
        }
    }
}

public class Exercise6_19 {
    public static void main(String[] args) {
        MyTv t = new MyTv();

        System.out.println(t);
        t.turnOnOff();
        t.channelDown();
        t.volumeDown();
        System.out.println(t);
        t.channelUp();
        t.volumeUp();
        t.turnOnOff();
        System.out.println(t);
    }
}
