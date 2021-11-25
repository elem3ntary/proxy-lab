package mailer;

import static org.junit.jupiter.api.Assertions.*;

class MailCodeTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.Test
    void generateText() {
        String data = MailCode.GREETINGS.generateText();
        assertEquals("greetings", data);
    }
}