import java.util.*;

class Solution {
    
    // Trie Node
    class TrieNode {
        TrieNode[] children;
        String word; // stores the root if this node is the end of a root
        public TrieNode() {
            children = new TrieNode[26];
            word = null;
        }
    }
    
    private TrieNode root;
    
    // Insert a word into the Trie
    private void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.word = word; // mark the end of a root
    }
    
    // Search for the shortest root in the Trie for the given word
    private String search(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) break;
            node = node.children[index];
            if (node.word != null) return node.word;
        }
        return word; // no root found, return the original word
    }
    
    public String replaceWords(List<String> dictionary, String sentence) {
        root = new TrieNode();
        
        // Build Trie
        for (String word : dictionary) {
            insert(word);
        }
        
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = search(words[i]);
        }
        
        return String.join(" ", words);
    }
}
