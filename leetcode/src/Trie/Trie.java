package Trie;

import java.util.Arrays;

class TrieNode{
    TrieNode[] children;
    boolean isEndOfWord;

    public TrieNode(){
        isEndOfWord = false;
        children = new TrieNode[26];
    }
}

public class Trie {

    TrieNode root;
    public Trie(){
        root = new TrieNode();
    }

     public void insert(String key){
        TrieNode curr = root;
        for(char c : key.toCharArray()){
            if(curr.children[c - 'a'] == null){
                TrieNode newNode = new TrieNode();
                curr.children[c - 'a'] = newNode;
            }
            curr = curr.children[c - 'a'];
        }

        curr.isEndOfWord = true;
    }

     public boolean search(String key){
        TrieNode curr = root;
        for(char c : key.toCharArray()){
            if(curr.children[c - 'a'] == null){
                return false;
            }

            curr  = curr.children[c - 'a'];
        }

        return curr.isEndOfWord;
    }

     public boolean isPrefix(String key){
        TrieNode curr = root;
        for(char c : key.toCharArray()){
            int index = c - 'a';
            if(curr.children[index] == null){
                return false;
            }
            curr = curr.children[index];
        }

        return true;
    }

    public static void main(String[] args) {
        Trie t = new Trie();
        t.insert("apple" );
        if(t.search("apple")){
            System.out.println("true");
        }else{
            System.out.println("false;");
        }
    }
}
