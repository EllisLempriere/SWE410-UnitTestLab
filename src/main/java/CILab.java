public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        String allUpper = myString.toUpperCase();

        if (myString.equals(allUpper))
            return true;

        return false;
    }

}

