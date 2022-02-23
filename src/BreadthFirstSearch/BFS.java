package BreadthFirstSearch;

import java.util.*;

public class BFS {
    public static void main(String[] args) {
        Map<String, String[]> graph = new HashMap<>();
        graph.put("you", new String[]{"alice", "bob", "bob", "clairea"});
        graph.put("bob", new String[]{"peggy"});
        graph.put("alice", new String[]{"anuj", "peggy"});
        graph.put("bob", new String[]{"peggy"});
        graph.put("clairea", new String[]{"thom", "jonny"});
        graph.put("anuj", new String[]{});
        graph.put("peggy", new String[]{});
        graph.put("thom", new String[]{});
        graph.put("jonny", new String[]{});

        String[] array = graph.get("you");
        Queue<String> queue = new LinkedList<>(Arrays.asList(array));

        Set<String> memoization = new HashSet<>();

        while (!queue.isEmpty()) {
            String person = queue.remove();

            String c = person.substring(person.length() - 1);

            if (memoization.contains(person))
                continue;
            if (c.equals("a")) {
                System.out.println(person + " is a mango seller");
                queue.clear();
            } else {
                String[] temp = graph.get(person);
                queue.addAll(Arrays.asList(temp));
                memoization.add(person);
            }
        }
    }
}
