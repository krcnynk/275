package com.company;

import java.util.Vector;

public class LevelsOfDifficultyList {
    private Vector<DiffLevel> levels;

    LevelsOfDifficultyList(){
        levels = new Vector<DiffLevel>();
    }

    //add task
    void addLevel(DiffLevel level){
        levels.add(level);
    }

    void removeLevel(DiffLevel level){
        levels.remove(level);
    }

    int getSize(){
        return levels.size();
    }
}
