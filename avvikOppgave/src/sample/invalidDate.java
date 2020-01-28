package sample;

public class invalidDate extends IllegalArgumentException {
    public invalidDate (String msg){
        super(msg);
    }
}
