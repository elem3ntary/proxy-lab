package mailer;

import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public enum MailCode {
    HAPPY_BIRTHDAY("happy_birthday.txt"), GREETINGS("greetings.txt");

    private final String filename;

    MailCode(String filename) {
        this.filename = filename;
    }

    @SneakyThrows
    public String generateText() {
        // Read file
        // Inject client data
        // Return text
        Path currentPath = Paths.get(System.getProperty("user.dir"));
        String templatesDir = "src/main/java/mailer/mail_templates";
        Path path = Paths.get(currentPath.toString(),templatesDir,filename);
        List<String> lines = Files.readAllLines(path);
        String fileContents = String.join("\n",lines);
        return fileContents;
    }
}