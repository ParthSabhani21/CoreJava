package variables_and_data_types;

public class DataTypes 
{
	public static void main(String[] args) 
	{
		// * all primitive data types are signed by default
		byte b = 10; // 0 : 1 byte : 8 bit : (-2^7 to 2^7 - 1) range
		short s = 100; // 0 : 2 byte : 16 bit : (-2^15 to 2^15 - 1) range
		int i = 1000; // 0 : 4 byte : 32 bit : (-2^31 to 2^31 - 1) range
		long l = 10000; // 0L : 8 byte : 64 bit : (-2^63 to 2^63 - 1) range
		float f = 1345.12f; // 0.0f : 4 byte : 32 bit : (-2^31 to 2^31 - 1) range : 6–7 significant decimal digits
		double d = 75788895.3512485; // 0.0d : 8 byte : 64 bit : (-2^63 to 2^63 - 1) range : 15 significant decimal digits
		char c = 'a'; // '\u0000' (the null character) : 2 byte : 16 bit : ‘\u0000’ (or 0) to ‘\uffff’ (or 65,535 inclusive) 
		boolean bool = true; // false : 1 bit 
	}
}
