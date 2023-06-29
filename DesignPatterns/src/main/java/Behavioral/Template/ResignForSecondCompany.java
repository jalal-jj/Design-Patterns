package Behavioral.Template;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
public class ResignForSecondCompany extends ResignForOwnBuisness{
    private String companyName;
    private String yourJob;
    private String address;
    private String from;
    private String to;
    private Date date;

    public ResignForSecondCompany(String companyName, String yourJob, String address, String from, String to, Date date) {
        this.companyName = companyName;
        this.yourJob = yourJob;
        this.address = address;
        this.from = from;
        this.to = to;
        this.date = date;
    }

    @Override
    public String companyName() {
        return companyName;
    }

    @Override
    public String yourJob() {
        return yourJob;
    }

    @Override
    public String address() {
        return address;
    }

    @Override
    public String from() {
        return from;
    }

    @Override
    public Date date() {
        return date;
    }

    @Override
    public String to() {
        return to;
    }

}
