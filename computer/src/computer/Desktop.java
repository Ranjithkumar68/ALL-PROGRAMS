package computer;

// MULTIPLE INHERITANCE
public class Desktop implements Hardware, Software {

	private void desktopModel() {
		System.out.println("MyDesktop");

	}

	@Override
	public void softwareResources() {
		System.out.println("Software");

	}

	@Override
	public void hardwareResources() {
		System.out.println("Hardware");

	}

	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.desktopModel();
		d.hardwareResources();
		d.softwareResources();
	}
}
