public class GajunSmartPhone implements GajunOnOff,GajunVolume {

    public void operation1(){
    }

    public void operation2(){
    }

	@Override
	public void turnOn() {
		System.out.println("GajunSmartPhone.turnOn()");
		
	}

	@Override
	public void turnOff() {
		System.out.println("GajunSmartPhone.turnOff()");
		
	}

	@Override
	public void up() {
		System.out.println("GajunSmartPhone.volumeUp()");
		
	}

	@Override
	public void down() {
		System.out.println("GajunSmartPhone.volumeDown()");
		
	}

}
