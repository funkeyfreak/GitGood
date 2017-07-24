//
// Created by dubjr on 4/9/2017.
//

#include <map>
#include "../Headers/Tries.h"


Tries* createNode(){
    Tries *t = new Tries();
    t->isLeaf = false;
    return t;
};

void TriesBase::searchAndPrint(Tries* root, const char* key){
    std::string
            str1("Keyword "),
            str2(" (found)"),
            str3(" (!found)");
    //search(root, key) ? : str2 = str3;
    //TODO message to console interface
}


