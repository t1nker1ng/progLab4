package Exc;

import java.io.IOException;

public class UncheckExc extends IOException{
    public  UncheckExc(int name){
        super("Wrong height");
    }

}