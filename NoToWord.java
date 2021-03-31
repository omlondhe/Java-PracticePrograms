import  java.util.Scanner;
import java.util.HashMap;

class NoToWord {
    public static void main(String []ar) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> data = new HashMap<String, String>() {{
            put("1", "One");
            put("2", "Two");
            put("3", "Three");
            put("4", "Four");
            put("5", "Five");
            put("6", "Six");
            put("7", "Seven");
            put("8", "Eight");
            put("9", "Nine");
            put("10", "Ten");
            put("11", "Eleven");
            put("12", "Twelve");
            put("13", "Thirteen");
            put("14", "Fourteen");
            put("15", "Fifteen");
            put("16", "Sixteen");
            put("17", "Seventeen");
            put("18", "Eighteen");
            put("19", "Nineteen");
            put("20", "Twenty");
            put("30", "Thirty");
            put("40", "Forty");
            put("50", "Fifty");
            put("60", "Sixty");
            put("70", "Seventy");
            put("80", "Eighty");
            put("90", "Ninety");
            // put(100, "");
            // put(200, "");
            // put(300, "");
            // put(400, "");
            // put(500, "");
            // put(600, "");
            // put(700, "");
            // put(800, "");
            // put(900, "");
        }};

        System.out.println("Enter a 4 digit Number");
        String number = sc.next();

        String split[] = String.valueOf(number).split("");
        String word = "";
        for (int i = 0; i < 4; i++) {
            if (i == 0 && split[i].equals("0")) {
                continue;
            } else if (i == 0) {
                word += " " + data.get(split[i]) + " Thousand ";
            } else if (i == 1 && split[i].equals("0")) {
                continue;
            } else if (i == 1) {
                word += data.get(split[i]) + " Hundred ";
            } else if (i == 2 && split[i].equals("0")) {
                word += "and ";
            } else if (i == 2 && (split[i] + split[i + 1]).equals("10")) {
                word += "and " + data.get("10");
                break;
            } else if (i == 2 && (split[i] + split[i + 1]).equals("11")) {
                word += "and " + data.get("11");
                break;
            } else if (i == 2 && (split[i] + split[i + 1]).equals("12")) {
                word += "and " + data.get("12");
                break;
            } else if (i == 2 && (split[i] + split[i + 1]).equals("13")) {
                word += "and " + data.get("13");
                break;
            } else if (i == 2 && (split[i] + split[i + 1]).equals("14")) {
                word += "and " + data.get("14");
                break;
            } else if (i == 2 && (split[i] + split[i + 1]).equals("15")) {
                word += "and " + data.get("15");
                break;
            } else if (i == 2 && (split[i] + split[i + 1]).equals("16")) {
                word += "and " + data.get("16");
                break;
            } else if (i == 2 && (split[i] + split[i + 1]).equals("17")) {
                word += "and " + data.get("17");
                break;
            } else if (i == 2 && (split[i] + split[i + 1]).equals("18")) {
                word += "and " + data.get("18");
                break;
            } else if (i == 2 && (split[i] + split[i + 1]).equals("19")) {
                word += "and " + data.get("19");
                break;
            } else if (i == 2 && split[i].equals("2")) {
                word += "and " + data.get("20") + " ";
            } else if (i == 2 && split[i].equals("3")) {
                word += "and " + data.get("30") + " ";
            } else if (i == 2 && split[i].equals("4")) {
                word += "and " + data.get("40") + " ";
            } else if (i == 2 && split[i].equals("5")) {
                word += "and " + data.get("50") + " ";
            } else if (i == 2 && split[i].equals("6")) {
                word += "and " + data.get("60") + " ";
            } else if (i == 2 && split[i].equals("7")) {
                word += "and " + data.get("70") + " ";
            } else if (i == 2 && split[i].equals("8")) {
                word += "and " + data.get("80") + " ";
            } else if (i == 2 && split[i].equals("9")) {
                word += "and " + data.get("90") + " ";
            } else if (i == 3 && split[i].equals("0")) {
                continue;
            } else if (i == 3) {
                word += data.get(split[i]);
            } 
        }

        if (word.startsWith("and")) {
            word = word.replace("and", "");
        }
        System.out.println(word);
    }
}
