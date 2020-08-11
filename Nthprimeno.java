
                    import java.util.Scanner;
    public class Nthprimeno {
      public static void main(String[] args) {
        int num=1, count=0;
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); 
        while (count < n){
          boolean f=false;
          num=num+1;
          for (int i =2; i <= num/2; i++){
            if (num % i == 0) { f=true;
              break;
            }
          }
          if(f==false)
       count++;
        }
        System.out.println("Value of nth prime is: " + num);
      }
    }
