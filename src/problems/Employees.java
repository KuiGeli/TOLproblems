package problems;

public class Employees {

    public String removeUnavailable(String employees) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(employees);


        while (stringBuilder.indexOf("(“Unavailable”") != -1) {
            int startingIndex = stringBuilder.indexOf(", (“Unavailable”");
            int charIndex = startingIndex + 13;
            int openParenthesis = 1;
            int closingParenthesis = 0;

            for (int i = charIndex; i < stringBuilder.length(); i++) {
                if (stringBuilder.charAt(i) == '(') {
                    openParenthesis++;
                } else if (stringBuilder.charAt(i) == ')') {
                    closingParenthesis++;
                }

                if (openParenthesis == closingParenthesis) {
                    stringBuilder.delete(startingIndex, i + 1);
                    i = stringBuilder.length();
                }

            }
        }

        return stringBuilder.toString();


    }

}
