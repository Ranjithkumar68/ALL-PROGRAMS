package org.computer;

public class Desktop extends Computer {
	private void desktopSize() {
		System.out.println("15.6 inch");
	}
	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.desktopSize();
		d.computerModel();
	}
}
