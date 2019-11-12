package sec01.exam02;

public class AnonymousObjectExample {
	public static void main(String[] args) {
		
		RemoteControl rc=new RemoteControl() {
			private int volume;

			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("TV를 켭니다");
				messageInfo("TV시청이 가능합니다.");
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("TV를 끕니다.");
				messageInfo("TV 시청이 불가능합니다.");
			}

			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				if(volume>RemoteControl.MAX_VOLUME) {
					this.volume=RemoteControl.MAX_VOLUME;
					
				}else if(volume<RemoteControl.MIN_VOLUME) {
					this.volume=RemoteControl.MIN_VOLUME;
				}else {
					this.volume=volume;
					
				}
				System.out.println("현재 TV 볼륨:"+this.volume);
			}
			public void messageInfo(String message) {
				System.out.println(message);
			}
		};
		
		rc.turnOn();
		rc.setVolume(7);
		rc.turnOff();
	}

}
