public class Elso{
    public static void main(String[] args){
        Train trainOne = new Train("Brian", 1999, 123.4125);
        Train trainTwo = new Train("James", 1997, 87.9121);
        Train trainThree = new Train("Katy", 2002, 100.2313);

        System.out.println(trainOne);   //Train(Brian (1999), 123,41 km/s)
        System.out.println(trainOne.getDriver());   //Brian
        System.out.println(trainOne.getYear());     //1999
        System.out.println(trainOne.getSpeed());    //123.4125
        System.out.println(trainOne.isFasterThan(trainTwo));    //true
        System.out.println(trainThree.isFasterThan(trainOne));  //false
        System.out.println(trainOne.speedCategory());   //fast
        System.out.println(trainTwo.speedCategory());   //normal
        System.out.println(trainThree.speedCategory()); //normal
    }
}