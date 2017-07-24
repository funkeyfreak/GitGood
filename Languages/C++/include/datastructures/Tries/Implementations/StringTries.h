#ifndef TRIES_LIBRARY_H
#define TRIES_LIBRARY_H

#include "../../GitGood/DataStructures/Tries/Tries.h"

class StringTries : Tries {
    bool insert(Tries *root, const char* key);
    bool search(Tries *root, const char* key);
};

#endif