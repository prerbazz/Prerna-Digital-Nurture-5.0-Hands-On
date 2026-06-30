public class DecoratorPatternTest {
    public static void main(String[] args) {
        Notifier notify=
                new SlackNotifierDecorator(
                        new SMSNotifierDecorator(
                                new EmailNotifier()
                        )
                );
        notify.send();
    }
}