
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final Map<String, String> responses = new HashMap<>();

    static {
        responses.put("hi", "Hello!");
        responses.put("is this project is completed?", "yess");
        responses.put("how are you?", "I'm doing well, thanks for asking!");
        responses.put("what's your name?", "My name is Chatbot.");
        responses.put("bye", "Goodbye!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chatbot: Hello! I'm a simple chatbot. Type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine().toLowerCase();

            if (userInput.equals("bye")) {
                System.out.println("Chatbot: Goodbye!");
                break;
            }

            String response = getResponse(userInput);
            System.out.println("Chatbot: " + response);
        }

        scanner.close();
    }

    private static String getResponse(String input) {
        for (Map.Entry<String, String> entry : responses.entrySet()) {
            if (input.contains(entry.getKey())) {
                return entry.getValue();
            }
        }
        return "I'm sorry, I don't understand.";
    }
}