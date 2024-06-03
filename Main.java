public class Main {
    public static void main(String[] args) {

        Database database = new Database();
        database.add(0, "John Clock", "+79001001010", 10);
        database.add(1, "John Smith", "+79002002020", 15);
        database.add(2, "John Black", "+79003003030", 25);
        database.add(3, "John White", "+79004004040", 15);
        database.add(4, "Ivan Russo", "+79004004040", 35);
        database.add(5, "Ivan Russo", "+79004444444", 5);

        database.getEmployeeById(5).addAdditionalPhone("+79005555555"); // second phone number

        System.out.println(database);

        database.add(1, "Jane Doe", "+79002002000", 10); // expected error message

        System.out.println(database.getEmployeeById(2));
        System.out.println(database.getEmployeesByExperience(15));
        database.getEmployeePhoneByName("Ivan Russo");

    }
}