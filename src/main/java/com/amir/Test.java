package com.amir;

import com.birdbrain.Finch;

public class Test {
    public static void main(String[] args) {
        Finch bird = new Finch();
        boolean yes = true;
int counter = 0;
        while (yes){
            bird.setMove("F", 2, 90);
            counter = counter+1;
            if (counter>4){
                yes = !yes;
            }
        }
if (!yes){
            bird.setMove("B", counter, 90);
            bird.setTurn("L", 90, 70);

}

bird.setMove("F", 4, 90);
 
            bird.setTurn("R", 90, 70);

            yes = !yes;
counter = 0;
            while(yes){
bird.setMove("F", 2, 90);
  counter = counter+1;
            if (counter>2){
                yes = !yes;
            }
            }
            if (!yes){
            bird.setMove("B", counter*4, 90);
            bird.setTurn("L", 90, 70);

}

counter = 2;

bird.setMove("F", 8, 90);
bird.setMove("B", 2, 90);
 bird.setTurn("R", 90, 70);
 bird.setMove("F", 12, 90);
 bird.setTurn("L", 90, 70);
 bird.setMove("F", counter, 90);
 bird.setMove("B", counter*2, 90);

        bird.disconnect();
    }
}