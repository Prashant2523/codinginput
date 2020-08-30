class Solution {
    public boolean isHappy(int n) {
        if (n == 1)
			return true;
		int a, m = n;
		int happy = 0;
		while (m > 0) { // Loop until the remaining is greater than 0
			a = m % 10;  // Extract the Last Digits
			happy += a * a;  // Calculate the remaining number
			m = m / 10; // Remaining Number
		}
		if (happy == 1)
			return true; // It is happy
		if (happy == 4) // The number will be unhappy if the sum never results in 1 and get stuck in the endless loop. That only happens when the sum at any given point is 4.
			return false; 
		return isHappy(happy);
    }
}
