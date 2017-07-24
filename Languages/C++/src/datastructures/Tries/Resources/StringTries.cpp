#include "../../Headers/StringTries.h"

#include <iostream>
//So we can have tools for dealing with null terminated strings, ugh
#include <cstring>
#include <map>
#include "../../Headers/StringTries.h"

    #define  TIESCHARTOINDEX(a) ((int) - (int)'a')

bool StringTries::insert(Tries* root, const char *key){
    if(!root){
        //TODO pass message to cmd interface
        return false;
    }
    std::map<int, Tries*>::iterator it;
    int keyLength = std::strlen(key);
    for(int level = 0; level < keyLength; ++level) {
        int index = TIESCHARTOINDEX(*(key + level));
        it = root->children.find(index);
        Tries *node = NULL;
        if (it != root->children.end()) {
            node = it->second;
        }
        else{
            node = createNode();
            root->children.insert(std::pair<int, Tries*>(index, node));
        }
        root = node;
    }
    root->isLeaf = true;
    return true;
};
bool StringTries::search(Tries *root, const char* key){
    if(!root){
        //TODO pass message to cmd interface
        return false;
    }
    std::map<int, Tries*>::iterator it;
    int keyLength = std::strlen(key);
    for(int level = 0; level<keyLength; ++level){
        int index = TIESCHARTOINDEX(*(key+level));
        it = root->children.find(index);
        Tries *node = NULL;
        if(it != root->children.end()){
            root = it->second;
            continue;
        }
        else {
            return false;
        }
    }
    //if the root @ child does not exist, then it
    //does not exist
    return (root->isLeaf)? true : false;
};