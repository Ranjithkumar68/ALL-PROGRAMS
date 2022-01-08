package org.Phone;

public class PhoneInfo {
	private void phoneName() {
	System.out.println("POCO X2");
	}
	private void phoneImeiNo() {
		System.out.println("875629871587319");
	}
	private void camera() {
		System.out.println("64MEGAPIXEL SONYIMX");
	}
	private void storage() {
		System.out.println("8GB+256GB");
	}
	 void osName() {
		System.out.println("ANDROID 11");
		
	}
	public static void main(String[] args) {
		PhoneInfo r=new PhoneInfo();
		r.phoneName();
		r.phoneImeiNo();
		r.camera();
		r.storage();
		r.osName();
	
	}
}
