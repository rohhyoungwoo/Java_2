package oper;
// 4번 : 비트연산자를 이용한 암호화와 복호화
public class BitEncryption {
	public static void main(String[] args) {
		int originalMsg = 42; //원본 메시지
		int key = 99; //비트 마스크(암,복호화에 사용)
		System.out.println("원본 메시지 : " + originalMsg);
		
		int encryptedMsg = originalMsg ^ key; //xor 연산을 통한 암호화
		System.out.println("암호화된 메시지 : " + encryptedMsg);
		
		int decryptedMsg = encryptedMsg ^ key; //암호화된 메시지를 동일한 키로 xor 연산을 통한 복호화
		System.out.println("복호화된 메시지 : " + decryptedMsg);
		
		
	}
}
