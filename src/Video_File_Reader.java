/*Create a bean that calculates the total storage needed for a video file.
*The input values are the video quality (720p or 1080p) and duration in seconds.
*The bean will calculate and display the storage requirements in MB and GB.
*Create an application that uses the bean and displays the results.
*Note that this is a server-only application.
*/

import java.io.Serializable;
/*
Creating a simple bean with all the Java Bean properties
such as having private fields, using the accesssor and muatator methods
Implementing the serializable interface
No argument constructor
 */

public class Video_File_Reader implements Serializable{
    private double videoLength;
    private int videoQuality;
    private double storage_capacity;//Display the total storage required for storage of the video file

    public double getStorage_capacity() {
        return storage_capacity;
    }

    public void setStorage_capacity(double storage_capacity) {
        this.storage_capacity = storage_capacity;
    }

    public Video_File_Reader(){

    }
    //Gets the length of the video file
    public static int getVideoLength(int videoLength){

        return videoLength;
    }
    public void setVideoLength(){
        this.videoLength = videoLength;
    }

     //Getter for the video quality
    public static int getVideoQuality(int videoQuality){
        return videoQuality;
    }

    public void setVideoQuality(){
        this.videoQuality = videoQuality;
    }

    public static void size( int videoLength, int videoQuality){
        double quality;
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

