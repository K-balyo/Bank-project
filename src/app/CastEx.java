package app;

//데이터 타입 및 형변환(묵시적, 명시적)
public class CastEx {

	public static void main(String[] args) {
		byte byte1 = 127;
		short short1;
		short1 = byte1; // byte(8 bits) => short(16 bits)
		byte1 = (byte)short1; // short(16 bits) => byte(8 bits)
		long su1 = 10;
		int su2 = (int)su1;
		System.out.println("result : " + su2);
		

		
	}

}
