package org.phone;

public class InternalStorage {

	private void processorName() {
		System.out.println("Snapdragon 730G");
	}
	private void ramSize() {
		System.out.println("8GB RAM");
	}
	public static void main(String[] args) {
		InternalStorage r = new InternalStorage();
				r.processorName();
				r.ramSize();
		ExternalStorage e = new ExternalStorage();
				e.size();
	}
}
