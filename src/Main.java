import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//Gets input from the user

        int videoLength; //In seconds
        int videoQuality; //720p or 1080p

        System.out.println("Please Enter  the video size: ");
        videoLength = input.nextInt();

        Video_File_Reader.getVideoLength(videoLength); //videoLength accessor method

        System.out.println("Is video quality 720p or 1080p?");
        System.out.println("(1) = 720\t (2) = 1080");
        System.out.println("Quality: ");
        videoQuality = input.nextInt();

        Video_File_Reader.getVideoQuality(videoQuality);//videoQuality accessor method

        Video_File_Reader videoSize = new Video_File_Reader();
        /**CAN NOT RESOLVE THIS METHOD: I am attempting to display
         * the video size text from the VideoReader Class.*/
        System.out.println(videoQuality);


    }
}




