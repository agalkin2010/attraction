import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Queue<Person> attraction = new LinkedList<>();
        attraction.addAll(generateClients());

        while (!attraction.isEmpty()) {
            Person currentClient = attraction.poll();
            System.out.println(currentClient.getFullName() + " прокатился на аттракционе");
            currentClient.decTicket();
            if (!currentClient.noTickets()) {
                attraction.offer(currentClient);
            }
        }
    }

    public static List<Person> generateClients() {
        List<Person> list = new LinkedList<>();
        list.add(new Person("Petya", "Ivanov", 5));
        list.add(new Person("Kolya", "Petrov", 3));
        list.add(new Person("Vasya", "Novikov", 2));
        list.add(new Person("Vanya", "Vasilev", 1));
        list.add(new Person("Tanya", "Nikolaeva", 4));
        return list;
    }

}
