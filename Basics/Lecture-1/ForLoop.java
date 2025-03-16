public class ForLoop {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += i;
        }
        System.out.println("The total sum by for loop is " + sum);
    }
}
//Example : 

// public class Solution {
// 	Scanner input = new scanner(System.in);
// 	int n = input.nextInt();
// 	int a = 0;
// 	int b = 1;
// 	if(n == 0){
// 		System.out.println(a);
// 	}else if(n == 1){
// 		System.out.println(b);
// 	}else if(n == 2){
// 		System.out.println(a + b);
// 	}else{
// 		int c = a + b;
// 		for(int i = 3; i <=n ; i++){
// 			a = b;
// 			b = c;
// 			c = a + b;
// 		}
// 		System.out.println(c);
// 	}
// }
