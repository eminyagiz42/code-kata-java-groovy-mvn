package com.codekata.leetcode.interview75.third25.tree;

class TrieNode {

        public char val;
        public boolean isWord;
        public String word;
        public TrieNode[] children = new TrieNode[26];

        public TrieNode() {}

        TrieNode(char c){
            TrieNode node = new TrieNode();
            node.val = c;
        }
}
