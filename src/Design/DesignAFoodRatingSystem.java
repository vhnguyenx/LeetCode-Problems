package Design;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class DesignAFoodRatingSystem {
    public class FoodEntity {
        String food;
        String cuisine;
        int rating;

        public FoodEntity(String food, String cuisine, int rating) {
            this.food = food;
            this.cuisine = cuisine;
            this.rating = rating;
        }

        public String getFood() {
            return food;
        }

        public String getCuisine() {
            return cuisine;
        }

        public int getRating() {
            return rating;
        }

        public void setRating(int rating) {
            this.rating = rating;
        }
    }

    HashMap<String, FoodEntity> foodMap = new HashMap<>();
    HashMap<String, TreeSet<FoodEntity>> cuisineMap = new HashMap<>();

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
      for(int i = 0 ; i < foods.length ; i++){
         FoodEntity food =  new FoodEntity(foods[i], cuisines[i], ratings[i]);
         foodMap.put(foods[i],food);
         cuisineMap.putIfAbsent(cuisines[i], new TreeSet<>(Comparator.comparingInt(FoodEntity::getRating).reversed().thenComparing(FoodEntity::getFood)));
         cuisineMap.get(cuisines[i]).add(food);
      }
    }

    public void changeRating(String food, int newRating) {
        FoodEntity fd = foodMap.get(food);
        fd.setRating(newRating);
        TreeSet<FoodEntity> set = cuisineMap.get(fd.getCuisine());
        set.remove(fd);
        set.add(fd);
    }

    public String highestRated(String cuisine) {
        return cuisineMap.get(cuisine).getFirst().getFood();
    }
}
