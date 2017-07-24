//
// Created by Administrator on 4/24/2017.
//

#ifndef GITGOOD_UNDIRECTEDGRAPH_H
#define GITGOOD_UNDIRECTEDGRAPH_H

#include "../../../../Resources/Headers/global.h"
#include "../Headers/Graphs.h"

#ifdef CBASE

virtual void addEdge(struct Graph* graph, int src,  int dest);

#else
class UGraph{

};

#endif //CBASE

#endif //GITGOOD_UNDIRECTEDGRAPH_H
