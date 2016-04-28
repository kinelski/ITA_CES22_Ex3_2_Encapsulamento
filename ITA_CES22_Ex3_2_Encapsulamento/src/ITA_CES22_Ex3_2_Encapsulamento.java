class time{
    private int hour;
    private int minute;
    
    time() {};
    
    public int get_hour (){
        return hour;
    }
    public int get_minute (){
        return minute;
    }
    
    public void set_hour (int hour){
        if (hour > 23 || hour < 0)
            System.out.println ("Valor invalido.");
        else this.hour = hour;
    }
    
    public void set_minute (int minute){
        if (minute > 59 || minute < 0)
            System.out.println ("Valor invalido.");
        else this.minute = minute;
    }
}

public class ITA_CES22_Ex3_2_Encapsulamento {

    public static void main(String[] args) {
    }
    
}
