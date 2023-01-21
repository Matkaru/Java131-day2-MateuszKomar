package Task8;

public class Validator {

    private void isDimensionViable(Parcel parcel){
        if (parcel.getxLenght() + parcel.getyLenght() + parcel.getzLenght() <= 300){
            System.out.println("git" + parcel);
        }else {
            System.out.println("złe wymiary" + parcel);
        }
    }
    private void isWeightAlright(Parcel parcel){
        if (parcel.getWeight() <= 30 && !parcel.isExpress()){

            System.out.println("Paczka" + parcel +"jest dobrej wagi i nie jest ekspresowa");
        } else if (parcel.getWeight() <= 15 && parcel.isExpress()) {
            System.out.println("Paczka" + parcel +"jest dobrej wagi i nie jest ekspresowa");
        }else {
            System.out.println("Paczka " + parcel + " jest złej wagi");
        }
    }

    public void validate(Parcel parcel){
        isDimensionViable(parcel);
        isWeightAlright(parcel);
    }

}
