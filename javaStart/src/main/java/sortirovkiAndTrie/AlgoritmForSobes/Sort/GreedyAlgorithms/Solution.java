package sortirovkiAndTrie.AlgoritmForSobes.Sort.GreedyAlgorithms;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item("гитара",7, 800));
        items.add(new Item("утюг",6, 500));
        items.add(new Item("чайник",3, 300));
        items.add(new Item("лампа",4, 500));
        items.add(new Item("телевизор",15, 2000));
        items.add(new Item("ваза",2, 450));
        items.add(new Item("миксер",1, 400));
        items.add(new Item("блендер",3, 200));

        Collections.sort(items);

        Bag firstBag = new Bag(30);

        fillBackpack(firstBag, items);

        System.out.println("Вес рюкзака состовляет - " + firstBag.getCurrentWeight() +
                ", общая стоимость вещей в рюкзаке - " + firstBag.getCurrentCost());


        //более эффектино
        Bag secondBag = new Bag(30);

        effectiveFillBackpack(secondBag, items);

        System.out.println("Вес рюкзака составляет - " + secondBag.getCurrentWeight() +
                ", общая стоимость вещей в рюкзаке - " + secondBag.getCurrentCost());

    }
    public static void fillBackpack(Bag bag, List<Item> items) {
        for (Item item : items) {
            if(bag.getMaxWeight() > bag.getCurrentWeight() + item.getWeight()) {
                bag.addItem(item);
            }
        }
    }

    //боолее эффективно
    public static void effectiveFillBackpack(Bag bag, List<Item> items) {
        Map<Double, Item> sortByRatio = new TreeMap(Collections.reverseOrder());
        for (Item item : items) {
            sortByRatio.put((double)item.getCost() / item.getWeight(), item);
        }

        for (Map.Entry<Double, Item> entry : sortByRatio.entrySet()) {
            if(bag.getMaxWeight() > bag.getCurrentWeight() + entry.getValue().getWeight()) {
                bag.addItem(entry.getValue());
            }
        }
    }
}