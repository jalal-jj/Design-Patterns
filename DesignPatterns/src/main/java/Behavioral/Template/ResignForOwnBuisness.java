package Behavioral.Template;

import java.util.Date;

public abstract class ResignForOwnBuisness {
    public abstract String companyName();
    public abstract String yourJob();
    public abstract String address();
    public abstract String from();
    public abstract Date date();
    public abstract String to();

    public String writeResign(){
        StringBuffer buffer=new StringBuffer();
        buffer.append("\n");
        buffer.append(companyName()+"\n");
        buffer.append("\n");
        buffer.append(yourJob()+", \n");
        buffer.append("Dear "+to());
        buffer.append("\n");
        buffer.append("It is to inform you that I have been working at your company for over two \n");
        buffer.append("years by now. It has been a wonderful experience, but I strive for more. I \n");
        buffer.append("loved the job; however, I wish to move forward with my own business. I am \n");
        buffer.append("going to run a restaurant around my area. To do this, my presence is \n");
        buffer.append("required during work hours which I cannot do while keeping this job. Also, I\n");
        buffer.append("believe that someone more deserving can have this job.\n");
        buffer.append("\n");
        buffer.append("I hope you will understand my position and accept my resignation.\n");
        buffer.append("\n");
        buffer.append("Thank you\n");
        buffer.append(from());
        buffer.append("\n");
        buffer.append(date());
        buffer.append("\n");
        buffer.append("Sign : ");
        return buffer.toString();
    }


}
