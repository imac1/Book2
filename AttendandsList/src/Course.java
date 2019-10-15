public class Course {

    int attendantsNr = 2;
    int ageAverage;

    public int calculateAttNr() {
        return attendantsNr;
    }

    public int malesNr( Attendant [] attendantsArray ) {
        int counter = 0;

        for (Attendant attendant : attendantsArray) {
            if (attendant.gender.equalsIgnoreCase("m")) {
                counter++;
            }
        }
        return counter;
    }


    public int calculateAvrAge(Attendant [] attendantsArray) {

        for (int i = 0; i < attendantsArray.length; i++) {

            ageAverage += attendantsArray[i].getAge();
        }

        return ageAverage / attendantsNr;
    }

}
