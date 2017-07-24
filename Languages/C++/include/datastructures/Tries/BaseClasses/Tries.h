//
// Created by dubjr on 4/9/2017.
//

#include <map>

#ifndef TRIES_TRIES_H
#define TRIES_TRIES_H


/**
 * Interface for all Tries.
 *
 * Implements a base class for all Tries. enfores the immplementation of
 * insert and search functionality
 * @name Tries
 *
 */

typedef struct TrieNode{
    std::map<int,struct TrieNode*> children;
    //isLeaf == true iff TrieNode = end_of_word
    bool isLeaf;

} Tries;

Tries* createNode();

class TriesBase {
public:
    /**
     *
     * @return
     */
    virtual bool insert(Tries *root, const char* key) = 0;
    virtual bool search(Tries *root, const char* key) = 0;
    void searchAndPrint(Tries *root, const char* key);
};

#endif //TRIES_TRIES_H
