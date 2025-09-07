package com.exception;

class AgeVerificationFailedException extends Exception{
	private String msg;
	public AgeVerificationFailedException(String msg) {
		this.msg = msg;
	}
	public String getErrorMessage() {
		return this.msg;
	}
}

public class CustomException {

	public static void onlineVoting(int age) {
		if(age<18) {
			try {
			throw new AgeVerificationFailedException("Age Verification Failed");
			}catch(AgeVerificationFailedException a) {
				System.out.println(a.getErrorMessage());
			}
		}else {
			System.out.println("Welcome to online voting");
		}
	}
	
	public static void main(String[] args) {
        onlineVoting(17);
	}

}
