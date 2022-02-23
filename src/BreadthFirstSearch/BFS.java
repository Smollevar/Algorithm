package BreadthFirstSearch;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        HashMap<String, String[]> graph = new HashMap<>();
        graph.put("you", new String[]{"alice", "bob", "claire"});
        graph.put("alice", new String[]{"anuj", "peggy"});
        graph.put("bob", new String[]{"peggy"});
        graph.put("claire", new String[]{"thom", "jonnya"});
        graph.put("anuj", new String[]{});
        graph.put("peggy", new String[]{});
        graph.put("thom", new String[]{});
        graph.put("jonnya", new String[]{});

        String[] array = graph.get("you");
        Queue<String> queue = new LinkedList<>(Arrays.asList(array));

        while (!queue.isEmpty()) {
            String person = queue.remove();
            System.out.print(person + " ");
            String c = person.substring(person.length() - 1);
            System.out.println(c);
            if (c.equals("a")){
                System.out.println(person + " is a mango seller");
                queue.clear();
            } else {
                String [] temp = graph.get(person);
                queue.addAll(Arrays.asList(temp));
            }
        }
    }
}
