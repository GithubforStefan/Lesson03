import java.util.*;

public class Exercise1_2 {



//The Fibonacci Thing :-) 0,1,1,2,3,5,8,13

//trying to loop through i=i+1;
//            fb[i]=fb[i-1]+fb[i-2];

        public static void main (String [] args) {


            int [] fb = new int[20];

            int i = 0;
            fb [i]= 0;

            i=i+1;
            fb[i]=1;

            i=i+1;
            fb[i]=fb[i-1]+fb[i-2];
            i=i+1;
            fb[i]=fb[i-1]+fb[i-2];
            i=i+1;
            fb[i]=fb[i-1]+fb[i-2];
            i=i+1;
            fb[i]=fb[i-1]+fb[i-2];
            i=i+1;
            fb[i]=fb[i-1]+fb[i-2];
            i=i+1;
            fb[i]=fb[i-1]+fb[i-2];
            i=i+1;
            fb[i]=fb[i-1]+fb[i-2];
            i=i+1;
            fb[i]=fb[i-1]+fb[i-2];
            i=i+1;
            fb[i]=fb[i-1]+fb[i-2];
            i=i+1;
            fb[i]=fb[i-1]+fb[i-2];
            i=i+1;
            fb[i]=fb[i-1]+fb[i-2];
            i=i+1;
            fb[i]=fb[i-1]+fb[i-2];
            i=i+1;
            fb[i]=fb[i-1]+fb[i-2];
            i=i+1;
            fb[i]=fb[i-1]+fb[i-2];
            i=i+1;
            fb[i]=fb[i-1]+fb[i-2];
            i=i+1;
            fb[i]=fb[i-1]+fb[i-2];
            i=i+1;
            fb[i]=fb[i-1]+fb[i-2];
            i=i+1;
            fb[i]=fb[i-1]+fb[i-2];
            i=i+1;


            System.out.println(Arrays.toString(fb));

        }

    }


