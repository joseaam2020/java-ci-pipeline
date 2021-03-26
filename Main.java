import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        while(true) {
            // Enter data using BufferReader
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            // Reading data using readLine
            String input = null;
            try {
                input = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            String[] inputs = input.split(" ");
            List numbers = new ArrayList();
            List actions = new ArrayList();
            for (String in : inputs) {
                try {
                    Double num = Double.parseDouble(in);
                    numbers.add(num);
                } catch (Exception e) {
                    switch (in) {
                        case "*":
                            actions.add("*");
                            break;
                        case "/":
                            actions.add("/");
                            break;
                        case "+":
                            actions.add("+");
                            break;
                        case "-":
                            actions.add("-");
                            break;
                    }
                }
            }
            Object temp = null;
            for (Object num : numbers) {
                if (temp == null) {
                    temp = num;
                    cal.setResult((double) num);
                } else {
                    if (!actions.isEmpty()) {
                        Object action = actions.get(0);
                        switch ((String) action) {
                            case "*":
                                cal.multiplicacion((double) num);
                                break;
                            case "/":
                                cal.division((double) num);
                                break;
                            case "+":
                                cal.suma((double) num);
                                break;
                            case "-":
                                cal.resta((double) num);
                                break;
                        }
                    }
                }
            }
            System.out.println(cal.igual());
        }
    }
}
