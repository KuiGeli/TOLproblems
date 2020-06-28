package problems;

public class Employees {

    /*
    the removeUnavailable method deletes the employees marked unavailable and their subordinates by counting the opening
    and closing parentheses;
     */
    public String removeUnavailable(String employees) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(employees);
        String unavailable = ", (“Unavailable”";

        while (stringBuilder.indexOf(unavailable) != -1) {
            int startingIndex = stringBuilder.indexOf(unavailable);
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
