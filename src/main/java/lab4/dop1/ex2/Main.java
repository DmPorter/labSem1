package lab4.dop1.ex2;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        User user1 = new User("Dima", 200);

        Admin admin = new Admin("Egor", 300);

        TemplateEngine.sendMessage(user1);
        TemplateEngine.sendMessage(admin);

    }
}
