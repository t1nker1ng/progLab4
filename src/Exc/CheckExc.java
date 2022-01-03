package Exc;

import java.io.IOException;

public class CheckExc extends IOException{
    public CheckExc(String name){
        super("Wrong input "+name);
    }
}