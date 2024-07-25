import java.util.*;

//Implementing class of Tries
//It contains a hashmap with (key : character value : TriNode)
class TriNode{
    HashMap<Character,TriNode> map;
    boolean isEnd;
    //constructor
    // public TriNode() {
    //     map=new HashMap<Character,TriNode>();
    //     isEnd=false;
    // }

    // constructor 2
    public TriNode(HashMap<Character,TriNode> map) {
        this.map=map;
        this.isEnd=false;
    }
}
public class Tries1 {
    //Insert each char
    public void chechkWord(String S,TriNode root) {
        TriNode curr=root;
        for(int i=0;i<S.length();i++) {
            char ch=A.charAt(i);
            if(!curr.map.containsKey(ch)) {
                curr.map.put((ch),new TriNode());
            }
            curr=curr.map.get(ch);
        }
        curr.isEnd=true;
    }
    //Search for each char
    public boolean isPresent(String S,TriNode root) {
        TriNode curr=root;
        for(int i=0;i<S.length();i++) {
            char ch=S.charAt(i);
            if(!curr.map.containsKey(ch)) {
                return false;
            }
            curr=curr.map.get(ch);
        }
        return curr.isEnd;
    }
    public static void main(String[] args) {
        TriNode root=new TriNode(null);
        root.isEnd=true;
        TriNode root2=new TriNode(null);
        root.map=root2;
    }

    //2
    /* */



    


    
}
