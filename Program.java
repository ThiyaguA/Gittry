package Programs;
import java.util.*;
import java.util.List;
public class ArrayTry {

    public static void main(String[] args) {
    	
    	
    	
    }
    }
    	
                            /* Swap two Variables without creating temp or third variabla */


//    	int a = 10;
//    	int b = 5;
//    	
//    	b+=a;
//    	 a = Math.abs(a-b);
//    	 b = Math.abs(a-b);
//    
//    	System.out.println(b);
//    	System.out.println(a);
//    }
//    }


                                             /* Fibonacci Series */

    	
//    	int n = 10, firstTerm = 0, secondTerm = 1;
//        System.out.println("Fibonacci Series till " + n + " terms:");
//
//        for (int i = 1; i <= n; ++i) {
//          System.out.print(firstTerm + ", ");
//
//          int nextTerm = firstTerm + secondTerm;
//          firstTerm = secondTerm;
//          secondTerm = nextTerm;
//        }
//      }
//    }

                                      /*  Prime Number  */
    	
//    	int n = 24;
//    	int fact = 0;
//    	
//    	for(int i =1;i<=n;i++) {
//    		if(n%i ==0) {
//    			fact++;
//    		}
//    	}
//    	if(fact==2) {
//    		System.out.println("Prime Number");
//    	}
//    	else {
//    		System.out.println("Not a Prime Number");
//    	}
//    }
//    }

                                    /*  Reverse a String  */


    	
//    	String s = "Hello, World!";
//    	char [] ch = new char [s.length()];
//    	
//    	for(int i =s.length()-1;i>=0;i--) {
//    		ch[i] = s.charAt(s.length()-i-1);
//    	}
//    	String res = new String(ch);
//    	System.out.println(res);
//    }
//    }

                                            
                                            /* Find the Factorial */
    	
//    	int fact = 10;
//    	int mul =1;
//    	
//    	for(int i = fact ; i>0;i--) {
//    		mul *= i;
//    	}
//    	System.out.println(mul);
//    }
//    }
    	

                                  /*  PALINDROME  ^/        


//    	String s = "malayalam";
//    	char [] ch = new char[s.length()];
//    	
//    	for(int i = s.length()-1 ; i>=0 ;i--) {
//    		ch[i] = s.charAt(s.length()-i-1);
//    	}
//    	String reversedString = new String(ch);
//    	
//    	if(s.equals(reversedString)) {
//    		System.out.println("True");
//    	}
//    	else {
//    		System.out.println("False");
//    	}
//    }
//    }

                                        
                             /*  Concate Two Strings and Sort it without using "Sort" Keyword  */

   	
//    	int [] n1 = { 7,5,4,1};
//    	int [] n2 = {1,3,6,2};
//    	
//    	int n = n1.length+n2.length;
//    	
//    	int [] c = new int [n];
//    	
//    	for(int i =0;i<n1.length;i++) {
//    		c[i] = n1[i];
//    	}
//    	for(int i =0;i<n2.length;i++) {
//    		c[n1.length +i] = n2[i];
//    	}
//    	System.out.println(Arrays.toString(c));
//    	for (int i = 0; i < n - 1; i++) {
//    		for (int j = 0; j < n - 1 - i; j++) {
//    			
//    			if (c[j] > c[j + 1]) {
//    		
//    				int temp = c[j];
//    				c[j] = c[j + 1];
//    				c[j + 1] = temp;
//    			}
//    		}
//    	}
//    	
//    	System.out.println(Arrays.toString(c));
//    	System.out.println(c[0]);
//    }
//}
    	
    	                          /*  Reverse a Array of Numbers   */

    	
    	
//    	int [] store = new int [n.length];
//    	int j =-1;
//    	
//    	for(int i =n.length-1;i>=0;i--) {
//    		if(j < n.length-1) {
//    		
//    		j++;
//    		store[j] = n[i];
//    	}
//    }
//    	System.out.println(Arrays.toString(store));
//    }
//    }
    	
                               /*  Add the array and Add the Single Numbers If it is 2 digit seperate and Add it 
                                   and Find a Difference  */

    	
//    	int []nums = {1,15,6,3};
//    
//        int sum1 = 0;
//        int sum2=0;
//        int sum3=0;
//
//
//        for(int i =0;i<nums.length;i++){
//            int num = (int) nums[i];
//            sum1 += num;
//      
//            if(num>0) {
//            	int temp = num;
//                int sep = 0;
//                while (temp > 0) {
//    	     sep = temp%10;
//    	     temp /= 10;
//    	     sum2+=sep;
//    	    }
//        }
//        }
//        System.out.println(Math.abs(sum1 - sum2));
//    }
//}
    	
         
                           /*  Concate Two Strings and Check whether it is Equal or not */

    	
//    	
//    	String [] word1 = {"ab", "c"};
//    	String [] word2 = {"a", "ccb"};
//    	
//    	String s1 = "";
//        String s2 = "";
//
//        for(int i =0;i<word1.length;i++){
//             s1 += word1[i];
//        }
//        for(int i =0;i<word2.length;i++){
//             s2 += word2[i];
//        }
//        System.out.println(s1);
//        System.out.println(s2);
//    }
//}
//    	int [] nums = {1,2,3,1};
//    	
//    	for(int i =0;i<nums.length;i++){
//            for(int j=i;j<nums.length;j++){
//                if(nums[i] == nums[j]) {
//          
//                }
//                System.out.println("False " + i + " " + j);
//            }
//        }
//    }
//}
    	
    	
                              /*  Prime Number Identification  */

//    	for (int i = 3; i <=100; i++) {
//            int factor =0;
//            for (int j = 1; j<=i ; j++) {
//                if(i%j == 0){
//                    factor++;
//                }
//            }
//            if(factor==2){
//                System.out.println(i + " is a Prime Number");
//            }
//        }
//    }
//}
    	
    	                          /*  Concate Two Arrays and Add it  */

		 
//		int[] nums1 = {1,3};
//		int [] nums2 = {2,4};
//
//		int m = nums1.length;
//        int n = nums2.length;
//        int tot = m+n;
//        int start =0;
//
//        int [] arr = new int [tot];
//
//        for(int i =0;i<m;i++){
//            arr[i] = nums1[i];
//        }
//        for(int i =0;i<n;i++){
//        	arr[m + i] = nums2[i];
//        }
//        
//        Arrays.sort(arr);
//        
//        if(tot%2==0){
//        	int n1 = nums1[m-1];
//        	int n2 = nums2[0];
//        	
//        	int val = n1>n2 ? n2:n1;
//        	double add = (double)(n1+n2)/val;
//        	System.out.println(add);
//        }
//        else {
//        	int middle = start + (tot - start)/2;
//        	System.out.println(arr[middle]);
//        }
//    }
//}