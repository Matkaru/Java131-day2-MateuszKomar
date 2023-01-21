package Task8;

public class Main {
    public static void main(String[] args) {


        Parcel parcel1 = new Parcel(10, 100, 10, 40.5f, true);
        Parcel parcel2 = new Parcel(10, 100, 10, 30, true);
        Parcel parcel3 = new Parcel(10, 100, 10, 30.5f, false);
        Parcel parcel4 = new Parcel(10, 100, 101, 12, false);

        Validator validator = new Validator();
//        validator.isDimensionViable(parcel1);
//        validator.isDimensionViable(parcel2);
//        validator.isDimensionViable(parcel3);
//        validator.isDimensionViable(parcel4);
//
//        System.out.println("##########################");
//
//        validator.isWeightAlright(parcel1);
//        validator.isWeightAlright(parcel2);
//        validator.isWeightAlright(parcel3);
//        validator.isWeightAlright(parcel4);

        System.out.println("################");

        validator.validate(parcel1);
        System.out.println();
        validator.validate(parcel2);
        System.out.println();
        validator.validate(parcel3);
        System.out.println();
        validator.validate(parcel4);



    }
}

