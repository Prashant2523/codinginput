   class Downup
   {


   public static void DownUp(int n) {
    if (n == 1) {
        System.out.println(n +" ");
         System.out.println(0 +" ");

    } else {
    	// DownUp(n - 2);
        System.out.println(n +" ");
        DownUp(n - 2);
      // System.out.println(0 +" ");
       System.out.println(n-1 +" ");
    }
}
public static void main(String[] args) {
	Downup.DownUp(9);
}}
