/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package authloginuser.lab4;

/**
 *
 * @author marissalubow
 */
public class Lab4 

{

    public static void main(String[] args) 
    {
//        countDown(5);
//        countDownEven(12); 
//        gcd(12,8); 
        //gcdSub(55,9);
        
       
    }
  
    //task 1: 
    static void countDown(int num) //entire algorithm: O(n)
    {

        if (num == 0) // test    

           System.out.println("Blastoff!");  //O(1)

       else {

            System.out.println("...");
            countDown(num-1); // recursive call //(T(n-1))

             } 

    }
    
//T(n) = T(n-1) + O(1) = O(n)
//example- if num = 5 
//The output will be "..." 
//... 
//... 
//...
//...
//...
//Blastoff! //when num == 0 will print Blastoff! 

  
    //count down even, only prints out even numbers 
    static void countDownEven(int num) //O(n)
    {

        if(num == 0) // test              //0(1)
        {
           System.out.println("Blastoff!");
        }
        else 
        {
           //int lastNum = num%10; 
           if(num%2 ==0 )
               System.out.println(num-2);
               countDownEven(num-2); //n-2 
           
           
        }

    }
    
    //T(n) = T(n-2) + O(1) = O(n)
    


//Task 2: 
static int gcd(int x, int y) 
{

      if (x % y == 0) //base case
      {    
          return y;
          
      }
      else
      {  
          return gcd(y, x % y);
      
      }

}
//this outputs: the gcd of two numbers for ex 12 and 8  would output: 4

//GCD using subtraction 
static int gcdSub(int x, int y) 
{
    int gcd = 0;
       
        if (x == y) //base case 
        {
            gcd = x;
            return gcd;
        }
        else if (x> y)
        {
            return gcdSub(x-y,y);
        }
        else
        {
            return gcdSub(x,y-x);
        }
      
}

//Task 3: 
    int fib(int n)   //O(2^n)
    {

        if(n <= 0) // base case  //O(1)
            return 0;
        else if(n == 1) // base case //O(1)
            return 1;
        else
           return fib(n – 1) + fib(n – 2);  
           //T(n-1) + T(n-2) 
           
    }  
   /*
    for each line of code it increases by 2^n 
    if we are checking fib(8) 
    if checks fib(7) and fib(6) which would be 2^1 
    then it would increase again exponentially for fib(6) we would need to check fib(5) and fib(4), then for fib(7) we'd need to check fib(6) and fib(5) making it now 2^2
    until eventually it would be checking 2^n times making it have a time complexity of 2^n
    
    Time complexity: T(n-1) + T(n-2) = O(2^n)
    */
    
    
    
    //Homework: 
    
    //1) 
    static void helloWorld(int n)// this int n will allow us to eventually hit our base case 
    {
        System.out.println("Hello World");
        
        if(n<=1) //base case 
            return; //exit and not recursively call 
        helloWorld(n-1); //n-1 allows us to hit our base case 
    }
    
    //2) 
    static int sum(int n1, int n2)
    {
         int result; 
         
         if(n1 > n2) //base case 
           result=1;
         
         else 
            result = n1 + sum(n1+1, n2); //gets the sum of numbers from n1 to n2 recursively 
         
       
        if(result %7 == 0) //checks if the numbers are multiples of 7 
           result = n1 + sum(n1+1, n2);
        
        return result; 
            
            
    }
    
    //3)
    static int binarySearch(int arr[], int left, int right, int x)
    {
        if (right >= left && left <= arr.length - 1) {
 
            int middle = left + (right - left) / 2;
 
           //checks the middle element
            if (arr[middle] == x)
                return middle;
 
            // If element is smaller than middle element, then the value will be on the left side 
            if (arr[middle] > x)
                return binarySearch(arr, left, middle - 1, x);
 
            //value will be on the right side of the array 
            return binarySearch(arr, middle + 1, right, x);
        }
 
      //return -1 if element not found 
        return -1;
    }
    
    
  
    
}




