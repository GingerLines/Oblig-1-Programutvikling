package sample;

public class invalidAge extends IllegalArgumentException {
    public invalidAge (String msg){
        super(msg);
    }
}
