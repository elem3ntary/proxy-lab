package mailer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MailBoxTest {
    private MailBox mailBox;

    @BeforeEach
    void setUp() {
        mailBox = new MailBox();
    }

    @Test
    void addMailInfo() {
        Client client = new Client();
        mailBox.addMailInfo(new MailInfo(client, MailCode.GREETINGS));

        assertEquals(1, mailBox.getInfos().size());
    }

    @Test
    void sendALl() {
    }
}