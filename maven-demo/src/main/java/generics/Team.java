package generics;

import java.util.ArrayList;
import java.util.List;

public class Team<T> {
    private String name;
    int played = 0;

    private List<T> members = new ArrayList<>();

    public boolean addPlayer(T player){
        if(members.contains(player)){
            return false;
        }
        members.add(player);
        return true;
    }
}
