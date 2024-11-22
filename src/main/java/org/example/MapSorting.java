package main.java.org.example;

import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

// map sorting by keys and by values
public class MapSorting {

    public Map<Integer, String> sortByKey(Map<Integer, String> map) {
        return new TreeMap<>(map);
    }

    public Map<Integer, String> sortByKeyInReverseOrder(Map<Integer, String> map) {
        TreeMap<Integer, String> sorted = new TreeMap<>(Comparator.reverseOrder());
        sorted.putAll(map);
        return sorted;
    }

    public Map<Integer, String> sortByValue(Map<Integer, String> map) {
        return map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new
                ));
    }

    public Map<Integer, String> sortByValueInReverseOrder(Map<Integer, String> map) {
        return map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new
                ));
    }
}
