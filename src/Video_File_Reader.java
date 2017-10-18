import java.io.Serializable;

public class Video_File_Reader implements Serializable{
    private double videoLength; //In seconds
    private int videoQuality; //720p or 1080p

    public Video_File_Reader(){   //no argument constructor

    }

    public static int getVideoLength(int videoLength){ //get Video Length
        return videoLength;
    }
    public void setVideoLength(){               //set Video Length
        this.videoLength = videoLength;
    }


    public static int getVideoQuality(int videoQuality){ //get Video Quality
        return videoQuality;
    }

    public void setVideoQuality(){               //set Video Quality
        this.videoQuality = videoQuality;
    }

    public static void size( int videoLength, int videoQuality){
        double quality, mb, gb;

        if(videoQuality == 1){          //this will test to see which "button" the user selects for video quality
            quality = 0.5 * videoLength;//in 720p, 1 second of video == 0.5 megabytes of data
            mb = quality;               //Megabytes: assign quality value
            gb = 1024 / mb;             //Gigabyte conversion: 1 gigabyte is exactly 1024 megabytes

            System.out.println("Video Quality: 720p\nVideo Length: " +
                    videoLength + "s = " + mb + " Megabytes (" + gb + " Gigabytes.");
        }
        else if(videoQuality == 2){
            quality = 1.2 * videoLength;//in 720p, 1 second of video == 0.5 megabytes of data
            mb = quality;               //Megabytes: assign quality value
            gb = 1024 / mb;             //Gigabyte conversion: 1 gigabyte is exactly 1024 megabytes

            System.out.println("Video Quality: 1080p\nVideo Length: " +
                    videoLength + "s = " + mb + " Megabytes (" + gb + " Gigabytes.");

        }
        else if(videoLength != 1 || videoLength != 2){
            System.out.println("INVALID ENTRY! ENTER (1) FOR 720p || (2) FOR 1080p!!");
        }
    }
}

