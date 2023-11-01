//Створіть клас Program з методом мейн.
//        Створіть клас User, в якому будуть два поля: private String login та Acount acount.
//        Створіть конструктор класу User, в якому будуть два параметри: String login та String password. В середині конструктора полю логін класу User буде присвоюватись параметр конструктора логін. Також в середині цього конструктора створіть екземпляр класу  Acount з параметром String password, який буде присвоюватись полю acount.
//        У класі  User створіть внутрішній клас Acount, в якому буде поле private String password.
//        Створіть конструктор класу Acount, з одним параметром  String password
//        Створіть метод в середині внутрішнього класу Acount під назвою displayAccount() без повернення та без параметрів, в цьому методі виведіть логін та пароль
//        У класі  Program створіть користувача з параметрами: "Alice", "qwerty". Використайте метод displayAccount().
//        Повинен бути виведений логін та пароль користувача приблизно такого вигляду: Account Login successful! Login: Alice, Password: qwerty

class Program {
    public static void main(String [] args){

    }
}
class User {
    private String login;
    private Account account;


    public User(String login, String password){
        this.login = login;
        this.account = new Account(password);
    }

    public void displayAccount(){
        System.out.println("Account Login successful! Login: " + login + ", Password: " + account.getPassword());
    }
    class Account {
        private String password;

        public Account(String password) {
            this.password = password;
        }

        public String getPassword() {
            return password;
        }
    }
}