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
        if (myString == null)
            return false;
        if (myString.length() == 0)
            return false;

        String allUpper = myString.toUpperCase();
        if (myString.equals(allUpper))
            return true;

        String allLower = myString.toLowerCase();
        if (myString.equals(allLower))
            return true;

        return false;
    }

}

