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

        boolean oneWord = false;
        for (int i = 0; i < myString.length(); i++) {
            if (i == 0 && myString.charAt(i) != ' ')
                oneWord = true;
            else if (myString.charAt(i) == ' ' && i != myString.length() - 1 && myString.charAt(i + 1) != ' ')
                oneWord = false;
        }
        if (!oneWord)
            throw new IllegalArgumentException("String must be one word");

        String allUpper = myString.toUpperCase();
        if (myString.equals(allUpper))
            return true;

        String allLower = myString.toLowerCase();
        if (myString.equals(allLower))
            return true;

        String firstChar = myString.substring(0, 1);
        String restStr = myString.substring(1);

        if (firstChar.toUpperCase().equals(firstChar) && restStr.toLowerCase().equals(restStr))
            return true;

        return false;
    }

}

