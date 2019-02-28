public class Lab1 {
	public static void main (String[] args){
	
		/*
		Залікова книжка 8111
		01 = "-"
		C = 2
		02 = "/"
		type = float
		*/

		float i, j, c = 2f, a, b, n, m, s = 0f, f;
		a = 1.6f;
		b = 5.8f;
		n = 10.5f;
		m = 12.7f;

		if (((a - (int)a) == 0 && (a > c || n < c) || ((a - (int)a) != 0)) && ((b - (int)b == 0 && (b > 0 || m < 0)) || b - (int) b != 0) && n > a && m > b){
			for (i = a; i <= n; i++){
				for (j = b; j <= m; j++){
					s += i / j /(i - c);
				}
			}
			System.out.println("Result: " + s);
		} else {
			System.out.println("Value is not correct");			
		}		
	}
}
