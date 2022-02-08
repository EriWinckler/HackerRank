package Challenges;

import java.util.Arrays;
import java.util.List;

public class OrganizingContainersOfBalls {

    //check the number of balls add them
    //check the number of containers and get the total size
    //if number total of balls is != number of containers return impossible
    //else return possible

    public static String organizingContainers(List<List<Integer>> container) {
        // Write your code here


        int[] cap = new int[container.size()];
        int[] ballTotal = new int[container.size()];

        for (int i = 0; i < container.size(); i++) {
            for (int j = 0; j < container.size(); j++) {
                cap[i] += container.get(i).get(j);
                ballTotal[j] += container.get(i).get(j);
            }
        }

        Arrays.sort(cap);
        Arrays.sort(ballTotal);

        if(Arrays.equals(cap, ballTotal)) {
            return "Possible";
        } else return "Impossible";
    }

    public static void main(String[] args) {
        //idk how to call main here!
    }
}



