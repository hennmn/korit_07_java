package ch14_abstraction.interaces;

public class ChannelDownButton extends Button{
    @Override
    public void onDown() {
        System.out.println("채널을 계속 내립니다.");
    }

    @Override
    public void onPressed() {
        System.out.println("채널을 한 칸 내립니다.");
    }


}
