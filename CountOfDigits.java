// finding no of digits in a number:

class CountOfDigits{

public static void main(String[] args) {
	
	int n = 4538;

	System.out.println(digitCount(n));
}
public static int digitCount(int n){
	int sum =0;

	while(n>0){
		n=n%10;
		sum++;

	}
	return sum;
}

}