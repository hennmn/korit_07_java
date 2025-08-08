package ch14_abstraction.interaces;

/*
    VolumeDownButton / VolumUpButton 클래스를 생성하고
    얘를 TvRemoteController 의 필드에 추가하고
     onPressedVolumeDownButton() / onDownVolumeDownButton()
     onPressedVolumeUpButton() / onUpVolumUpButton() 메서드를 정의하시고
     Main에서
     음량을 한 칸 내립니다.
     음량을 계속 내립니다.
     음량을 한 칸 올립니다.
     음량을 계속 올립니다. # 1로 푸시오.
     음량을 계속 올립니다. # 2로 푸시오.

 */

public class Main {
    public static void main(String[] args) {
//        PowerButton powerButton = new PowerButton();
//        ChannelDownButton channelDownButton = new ChannelDownButton();
//        ChannelUpButton channelUpButton = new ChannelUpButton();
        // ⬆️⬆️ 원래는 이렇게 생성해야 하는 것을
//
//        TvRemoteController tvRemoteController = new TvRemoteController(
//                powerButton, channelDownButton, channelUpButton
//        );
//
//        powerButton.onPressed();
//        tvRemoteController.onPressedPowerButton();


        // 굳이 별개의 버튼 객체들을 만들지 않고 TvRemoteController 객체를
        // 생성하는 방법
        TvRemoteController tvRemoteController = new TvRemoteController(
                new PowerButton(), new ChannelDownButton(), new ChannelUpButton(), new VolumeDownButton(), new VolumeUpButton()
        );

        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onPressedChannelDownButton();
        tvRemoteController.onDownChannelDownButton();
        tvRemoteController.onPressedChannelUpButton();
        // # 1에 대한 Main에서의 실행 방법
        System.out.println(tvRemoteController.onUpChannelUpButton1());
        // # 2에 대한 실행
        tvRemoteController.onUpChannelUpButton2();
        tvRemoteController.onPressedVolumeDownButton();
        tvRemoteController.onDownVolumeDownButton();
        tvRemoteController.onPressedVolumeUpButton();

        //onUp은 리턴타입이 String이기 때문에 #1은 return 그대로 sout으로 출력하고
        // #2 는 메서드 내에서 sout을 써서 volumneonUp을 써줌




        // # 1에 대한 실행
        System.out.println(tvRemoteController.onUpVolumeUpButton1());
        // # 2에 대한 실행
        tvRemoteController.onUpVolumeUpButton2();
    }
}
