//
// Created by Administrator on 4/24/2017.
//


#include "../Headers/Graphs.h"

struct  AdjListNode{
    template <typename T>
    T dest;
    struct AdjListNode* next;
};

struct  AdjList{
    struct AdjListNode* head;
};

struct Graph {
    template <typename T>
    T V;
    struct AdjList* array;
};

struct AdjListNode* newAdjListNode(int dest){
    struct AdjListNode* newNode =
            (struct AdjListNode*) malloc(sizeof(struct AdjListNode));
    newNode->dest = dest;
    newNode->next = NULL;
    return newNode;
}

struct Graph* createGraph(int V){
    struct Graph* graph = (struct Graph*) malloc(sizeof(struct Graph));
    graph->V = V;

    //Create adjacency list
    graph->array = (struct AdjList*) malloc(V * sizeof(AdjList));

    //Initialize each adjacency list as empty
    int i;
    for(i = 0; i < V; ++i){
        graph->array[i].head = NULL;
    }

    return graph;
}

virtual void addEdge(struct Graph* graph, int src,  int dest) = 0;

namespace Graphs{
    Vertex::~Vertex() {
        for(int i = 0; i < this->adjList; i++){
            delete this->adjList[i];
        }
        delete this->adjList;
    }
    bool Vertex::isVisited() {
        return this.visited;
    }
    void Vertex::visit() {
        visited = true;
    }
    void Vertex::unVisit() {
        visited = false;
    }

    void Vertex::addToAdjList(static const Edge* add) {

    }

    void Vertex::removeFromAdjList(static const Edge* remove) {

    }

    GraphMatrix::GraphMatrix(int V) {

    }

    GraphMatrix::~GraphMatrix() {
        for (int i = 0; i < this->dim.first; i++) {
            delete[] adj[i];
        }
        delete[] adj;
    }
    void GraphMatrix::addEdge(int u, int v) {

    }
    void GraphMatrix::print() {

    }

}