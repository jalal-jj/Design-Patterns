package Behavioral.Template;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        ResignForFirstCompany forFirstCompany=
                new ResignForFirstCompany("First Company","Full Stack Dev","yourAddress","yourName","Director of Company",new Date());
        ResignForSecondCompany secondCompany=
                new ResignForSecondCompany("Second Company","Java Dev","myAddress","Jalal","Director of IT",new Date());
        System.out.println(forFirstCompany.writeResign());
        System.out.println(secondCompany.writeResign());
    }
}
