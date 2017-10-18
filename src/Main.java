import java.util.Scanner;
public class Main {

    public Main() {
        super();
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int videoLength;
        int videoQuality;
        double storage_capacity;
        double quality;

         //Prompts the user to enter the length or the video running time.
        System.out.println("Please Enter the total video running time in minutes: ");
        videoLength = input.nextInt();
        Video_File_Reader.getVideoLength(videoLength);

        System.out.println("Please choose (1) = 720 "+ "or (2) = 1080");
            double MB;
            double GB;
            if(videoQuality == 1){
                quality = 0.5 * videoLength;
                MB = quality;
                GB = 1000 / MB;

                System.out.println("Video Quality: 720p\nVideo Length: " +
                        videoLength + "s = " + MB + " Megabytes (" + GB + " Gigabytes.");
            }
            else if(videoQuality == 2){
                quality = 1.2 * videoLength;
                MB = quality;
                GB = 1024 / MB;

                System.out.println("Video Quality: 1080p\nVideo Length: " +
                        videoLength + "s = " + MB + " Megabytes (" + MB + " Gigabytes.");

            }
            else if(videoLength != 1 || videoLength != 2){
                System.out.println("The video quality  choice is not valid. Please choose either 1 or 2. ");
            }

    }
}




