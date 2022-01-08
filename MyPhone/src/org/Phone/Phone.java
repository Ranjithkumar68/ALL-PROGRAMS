package org.Phone;

public class Phone {
	private void phoneInfo(String model, long imei) {
		System.out.println("Model :" + model + "\n" + "IMEI:" + imei);
	}

	private void phoneInfo(int camera , String Storage) {
		System.out.println("Camera:"+ camera +"\n" +"Storage:"+ Storage);
	}
	public static void main(String[] args) {
		Phone r=new Phone();
	r.phoneInfo("POCO X2", 9173461834691L);
	r.phoneInfo(64, "8GB+256GB");
	}}
