#include <stdio.h>
#include <stdlib.h>
#include <assert.h>

typedef struct Queue Queue;
typedef struct QueueElem QueueElem;
struct QueueElem{
    int value;
    QueueElem* successor;
};
struct Queue{
    QueueElem* front;
    QueueElem* back;
};

QueueElem* createQueueElem(int value){

    return 0;
}

void pushBack(Queue* queue, int value){

}

int popFront(Queue* queue){

    return 0;
}

int main(){
    Queue myQueue = {0,0};
    pushBack(&myQueue, 1);
    pushBack(&myQueue, 2);
    pushBack(&myQueue, 3);

    printf("%d\n", popFront(&myQueue));
    printf("%d\n", popFront(&myQueue));
    printf("%d\n", popFront(&myQueue));

    return 0;
}