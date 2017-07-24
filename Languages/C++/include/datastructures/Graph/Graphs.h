//
// Created by Administrator on 4/24/2017.
//

#ifndef GITGOOD_GRAPHS_H
#define GITGOOD_GRAPHS_H
#define CBASE = 0

#include <stdio.h>
#include <stdlib.h>
#include <iostream>
#include <list>
#include <stack>
#include <vector>
#include "../../../../Resources/Headers/global.h"

namespace Graphs {

#if CBASE

    // Adjacency List Node data structure
    struct AdjListNode;

    // Adjacency List Node list data structure
    struct AdjList;

    // A structure to represent a graph
    // The size of the array will be the number of vertices
    // in the graph
    struct Graph;

    /**
     * A utility function to create a new adjacenncy list node
     * @param dist The distance from some
     * @return
     */
    struct AdjListNode *newAdjListNode(int dist);

    /**
     * Creates an instance of the Graph struct
     * @param V The number of nodes in the Graph
     * @return A new instance of the Graph struct
     */
    struct Graph *createGraph(int V);

    /**
     *
     * @param graph
     * @param src
     * @param dest
     */
    virtual void addEdge(struct Graph *graph, int src, int dest);

#else
    /*class Graphs;
    class Edge;
    class Vertex;
    class GraphMatrix;
    class GraphList;*/

    class Edge{

    };
    class Node{

    };
    class Vertex{
    protected:
        bool visited;
        std::vector<Edge*> adjList;
    public:
        Verted();
        ~Vertex();
        bool isVisited();
        void addToAdjList(static const Edge* add);
        void removeFromAdjList(static const Edge* remove);
        void visit();
        void unVisit();

    };

    class Graphs{

    };
    /**
     * A class for supporting the matrix representation of a graph
     * @author Dalin Williams
    */
    class GraphMatrix{
    protected:
        /***
         * The number of vertices
         */
        int V;
        /**
         * The dimentions of the matrix, i.e. A matrix of 9x9 will have a dim defined as  dim[9][9]
         */
        std::pair<int, int> dim;
        /**
         * A 2d, dynamically allowicated array to contain our pointers
         */
        bool **adj;
    public:
        /**
         *
         * @param V
         */
        GraphMatrix(int V);
        /**
         *
         */
        ~GraphMatrix();
        void addEdge(int u, int v);
        void print();
    };
    class GraphList{

    };

#endif //CBASE

}
#endif //GITGOOD_GRAPHS_H
