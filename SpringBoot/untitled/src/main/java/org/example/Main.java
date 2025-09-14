package org.example;

import java.util.*;

public class Main {
    static Map<String, List<List<String>>> recipes = new HashMap<>();
    static Map<String, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().trim();
            String[] parts = line.split("=");
            String potion = parts[0].trim();
            String[] ingredients = parts[1].split("\\+");

            recipes.putIfAbsent(potion, new ArrayList<>());
            recipes.get(potion).add(Arrays.asList(ingredients[0].trim(), ingredients[1].trim()));
        }

        String target = sc.nextLine().trim();
        sc.close();

        int result = minOrbs(target);
        if (result == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(result);
        }
    }

    static int minOrbs(String potion) {
        if (memo.containsKey(potion)) return memo.get(potion);

        if (!recipes.containsKey(potion)) {
            memo.put(potion, 1);
            return 1;
        }

        int minCost = Integer.MAX_VALUE;
        for (List<String> ing : recipes.get(potion)) {
            int left = minOrbs(ing.get(0));
            int right = minOrbs(ing.get(1));

            if (left == Integer.MAX_VALUE || right == Integer.MAX_VALUE) continue;

            minCost = Math.min(minCost, left + right);
        }

        memo.put(potion, minCost);
        return minCost;
    }
}
//awakening=snakefangs+wolfbane
//
//        veritaserum=snakefangs+awakening
//
//dragontonic=snakefangs+velarin
//
//        dragontonic=awakening+veritaserum
//
//dragontonic