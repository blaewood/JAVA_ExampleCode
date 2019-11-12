package sec01.exam02;

public class AnonymousObjectExample {
	public static void main(String[] args) {
		
		RemoteControl rc=new RemoteControl() {
			private int volume;

			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("TV�� �մϴ�");
				messageInfo("TV��û�� �����մϴ�.");
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("TV�� ���ϴ�.");
				messageInfo("TV ��û�� �Ұ����մϴ�.");
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
				System.out.println("���� TV ����:"+this.volume);
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
