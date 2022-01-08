package org.network;

public class Wifi {
	public void wifiName() {
		System.out.println("WifiName");
	}

	public static void main(String[] args) {
		Wifi w = new Wifi();
		w.wifiName();

		MobileData m = new MobileData();
		m.dataName();

		Lan l = new Lan();
		l.lanName();

		Wireless r = new Wireless();
		r.modamName();

	}

}
