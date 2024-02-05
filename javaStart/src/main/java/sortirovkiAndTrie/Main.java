package sortirovkiAndTrie;


import java.util.*;

class Dragon {
    private int interest;
    private int voracity;


    public Dragon(int interest, int voracity) {
        this.interest = interest;
        this.voracity = voracity;
    }

    public int getInterest() {
        return interest;
    }

    public int getVoracity() {
        return voracity;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt(); // число друзей Кати
        int m = scanner.nextInt(); // число пар драконов, которые дружат друг с другом
        int g = scanner.nextInt(); // максимальная суммарная прожорливость

        List<Dragon> dragons = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            dragons.add(new Dragon(scanner.nextInt(), scanner.nextInt()));
        }

        // Сортируем список драконов по убыванию интересности
        Collections.sort(dragons, Comparator.comparing(Dragon::getInterest).reversed());

        int sumVoracity = 0; // суммарная прожорливость
        List<Dragon> invitedDragons = new ArrayList<>(); // список приглашенных драконов

        for (Dragon dragon : dragons) {
            if (sumVoracity + dragon.getVoracity() <= g) {
                invitedDragons.add(dragon);
                sumVoracity += dragon.getVoracity();
            }
        }

        System.out.println("Список гостей:");
        for (Dragon dragon : invitedDragons) {
            System.out.println("Интересность: " + dragon.getInterest() + ", Прожорливость: " + dragon.getVoracity());
        }
    }
}



