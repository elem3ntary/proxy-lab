package mailer;

import java.util.HashMap;

public class MailBox {
    private HashMap<Integer, MailInfo> infos = new HashMap();

    void addMailInfo(MailInfo mailInfo) {
        infos.put(mailInfo.getClient().getId(), mailInfo);
    }

    void sendALl() {
        MailSender mailSender = new MailSender();
        for (MailInfo info: infos.values()) {
            mailSender.sendMail(info);

        }
    }

}
