/**
 * Created by Brian Yu on 7/12/2017.
 */

public class byrandomintegers {
    public static void main(String[] args){
        int[] random = new int[10];
        System.out.println("This is a randomly generated 10 integer array.");
        for(int i=0; i<10; i++){
            random[i] = (int)(Math.random()*100); //fills array with random integers from 0-99
            System.out.println(random[i]);
        }

        System.out.println("These are the integers at the even indexes of the array.");
        for(int n=0; n<10; n+=2) {
            System.out.println(random[n]);
        }

        System.out.println("These are the even integers of the array.");
        for(int a=0; a<10; a++){
            int even = random[a]%2;
            if(even == 0){
                System.out.println(random[a]);
            }
        }

        System.out.println("These are the first and last elements of the array.");
        System.out.println(random[0]);
        System.out.println(random[random.length-1]);

        System.out.println("This is the minimum value of the array.");
        int min = random[0];
        for(int b=0; b<10; b++){
            if(min > random[b]){
                min = random[b];
            }
        }
        System.out.println(min);

        System.out.println("This is the maximum value of the array.");
        int max = random[0];
        for(int c=0; c<10; c++){
            if(max<random[c]){
                max = random[c];
            }
        }
        System.out.println(max);

        System.out.println("This is the sum of all the elements of the array.");
        int sum = 0;
        for(int d=0; d<10; d++){
            sum += random[d];
        }
        System.out.println(sum);

        System.out.println("This is the alternating sum of all the elements in the array.");
        int altsum = 0;
        for(int e=0; e<10; e++){
            if((e%2)==0){
                altsum += random[e];
            }else {
                altsum -= random[e];
            }
        }
        System.out.println(altsum);
    }
}