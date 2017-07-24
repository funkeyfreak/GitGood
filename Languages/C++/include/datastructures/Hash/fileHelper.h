//
// Created by dubjr on 3/19/2017.
//
#include <stdio.h>
#include "hashHelper.h"
#ifndef UNTITLED_FILEHELPER_H
#define UNTITLED_FILEHELPER_H
#define CHUNK 1024

/**
 *
 */
typedef struct fileHelper{
    char* fileName;
    FILE *file;
    hashM hash;
    char buf[CHUNK];
} fileHelper, *fileH;

/**
 *
 * @param str
 */
void stringRemoveNonAlphaNum(char *str);

/**
 *
 * @param file
 */
void concordance(fileH file);

/**
 *
 * @param fileName
 * @return
 */
fileH newFileHelper(char* fileName);

/**
 *
 * @param file
 */
void freeFileHelper(fileH file);

#endif //UNTITLED_FILEHELPER_H
