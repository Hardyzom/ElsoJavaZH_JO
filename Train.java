public class Train {
    private String name;        //immutable vagymi
    private int year;
    private double speed;

    public Train(String name, int year, double speed){
        this.name = name;
        this.year = year;
        this.speed = speed;
    }

    public String getDriver(){
        return name;
    }

    public int getYear(){
        return year;
    }

    public double getSpeed(){
        return speed;
    }

    public boolean isFasterThan(Train otherTrain){
        return this.speed > otherTrain.speed;
        
    }

    public String speedCategory(){
        if (speed < 80){
            return "slow";
        }
        else if(speed >= 80 && speed <= 120){
            return "normal";
        }

            return "fast";
    }

    @Override
    public String toString(){
        return String.format("Train(%s (%d), %.2f km/s)", name, year, speed);
    }

}
