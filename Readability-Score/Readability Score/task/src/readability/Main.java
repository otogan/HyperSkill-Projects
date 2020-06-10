package readability;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String whitespace = "[ \n\t]+"; //"[ \\s]+";
        String sentenceEnd = "[.!?]";

        String path = args[0]; //"C:\\Users\\Onur\\Documents\\in2.txt";

        String input = readFile(path);
        System.out.println("The text is:");
        System.out.println(input);
        String[] sentences = input.trim().split(sentenceEnd);
        int sentenceCount = sentences.length;
        int wordCount = 0;
        int charCount = input.replaceAll(whitespace, "").length();
        for (String sentence : sentences) {
            String[] words = sentence.trim().split(whitespace);
            wordCount += words.length;
        }
        double score = calculateScore(charCount, wordCount, sentenceCount);
//        score = Math.round(score * 100.0) / 100.0;
        System.out.println("Words: " + wordCount);
        System.out.println("Sentences: " + sentenceCount);
        System.out.println("Characters: " + charCount);
        System.out.println("The score is: " + doubleToStr(score));
        System.out.println("This text should be understood by " + getAgeLevel(score) + " year olds.");
    }

    private static String doubleToStr(double num) {
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.FLOOR);
        return df.format(num);
    }

    private static double calculateScore(double characters, double words, double sentences) {
        return 4.71 * (characters / words) + 0.5 * (words / sentences) - 21.43;
    }

    private static String getAgeLevel(double score) {
        int num = (int) Math.ceil(score);
        switch (num) {
            case 1:
                return "5-6";
            case 2:
                return "6-7";
            case 3:
                return "7-9";
            case 4:
                return "9-10";
            case 5:
                return "10-11";
            case 6:
                return "11-12";
            case 7:
                return "12-13";
            case 8:
                return "13-14";
            case 9:
                return "14-15";
            case 10:
                return "15-16";
            case 11:
                return "16-17";
            case 12:
                return "17-18";
            case 13:
                return "18-24";
            case 14:
                return "24+";
            default:
                return "no match";
        }
    }

    public static String readFile(String path) {
        File file = new File(path);
        StringBuilder input = new StringBuilder();
        if (file.exists()) {
            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNextLine()) {
                    input.append(scanner.nextLine());
                    input.append("\n");
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        return input.toString();
    }
}
