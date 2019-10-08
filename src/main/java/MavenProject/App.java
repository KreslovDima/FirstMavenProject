package MavenProject;  //Dima Kreslov 1 group

import java.util.Arrays;

public class App
{




    public static void main( String[] args )
    {
        int arr[] ={62, 84, 32, 5, 0, 14, 52, 82, 58, 71};



            Arrays.sort(arr);


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}