fun main() {
    var q = Queue(5)
    q.dequeue()
    q.enqueue(1)
    q.enqueue(2)
    q.enqueue(3)
    q.display()
    q.dequeue()
}
class Queue(var capacity: Int) {
    var data = IntArray(capacity)
    var front = 0
    var rear = 0

    fun enqueue(value: Int) {
        if (isFull()) {
            println("queue is full")
            return
        }
        data[rear] = value
        rear++
    }

    fun dequeue(): Int? {
        if (isEmpty()) {
            println("Queue is empty")
            return null
        }
        var removed = data[front]
        for (i in front until rear - 1) {

        }
        {
            data[i] = data[i + 1]
        }
        rear--
        return removed
    }

    fun peek(): Int? {
        if (isEmpty()) {
            return null
        }
        return data[front]
    }

    fun isFull(): Boolean {
        return rear == capacity
        //if rear is 3 and capacity of the queue, the queue is full
    }

    fun isEmpty(): Boolean {
        return front == rear
        //if front is at 0 and rear o the queue is empty
    }

    fun display() {
        if (isEmpty()){
           return
        }
        for(i in front..rear){

        }
    }
}
