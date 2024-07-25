import java.util.ArrayList;

public class Q1 {
    class TriNode{
        HashMap<Character,TriNode> map;
        boolean isEnd;
        public TriNode() {
            map=new HashMap<Character,TriNode>();
            isEnd=false;
        }
    }
    //To insert into trie
    public TriNode insertStr(TriNode root, String A) {
        TriNode curr=root;
        for(int i=0;i<A.length();i++) {
            char ch=A.charAt(i);
            if(!curr.map.containsKey(ch))  {
                curr.map.put(ch,new TriNode());
            }
            curr=curr.map.get(ch);
        }
        curr.isEnd=true;
    }
    //Search in the triNode
    public boolean search(triNode root,String A) {
        TriNode curr=root;
        for(int i=0;i<A.length();i++) {
            char ch=A.charAt(i);
            if(!curr.map.containsKey(ch)) {
                return false;
            }
            curr=curr.map.get(ch);
        }
        return curr.isEnd;
    }
    //find prefixCount
    public int findPrefixCount(TriNode root, String A) {
        TriNode curr=root;
        for(int i=0;i<A.length();i++) {
            char ch= A.charAt(i);
            if(!curr.map.containKey(ch)) {
                return 0;
            }
            curr=curr.map.get(ch);
        }
        return countWords(curr);
    }
    //
    public int countWords(triNode node) {
        itn count=0;
        if(node.isEnd) {
            count++;
        }
        for(triNode child: node.map.values()) {
            count+=countWords(child);
        }
    }
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<String> B) {
        triNode root=new TriNode();
        triNode trie=new TriNode();
        ArrayList<Integer> ans=new ArrayList<>();
        // for(int i=0;i<A.length;i++) {
        //     if(A[i]==0) {
        //         trie=insertStr(root,B[i]);
        //     }
        //     else {
        //         if(search(trie, B[i])) {
        //             ans.add()
        //         }
        //     }
        // }
        for(int i=0;i<A.size();i++) {
            if(A.get(i)==0) {
                root=insertStr(root,B.get(i));
            }
            else {
                
            }
        }

    }
    
}
