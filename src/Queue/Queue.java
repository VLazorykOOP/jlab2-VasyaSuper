package Queue;

public class Queue {
    private int[] data;
    private int front;
    private int rear;

    // Конструктор, який ініціалізує порожню чергу
    public Queue() {
        data = new int[10]; // Початковий розмір черги
        front = 0;          // останній елемент
        rear = -1;          // попередній елемент
    }

    // Додавання елемента до черги
    public void enqueue(int value) {
        if (rear == data.length - 1) { // Перевірка на переповнення черги
            resize();
        }
        data[++rear] = value;
    }

    // Вилучення елемента з черги
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        int value = data[front++];
        if (front == rear + 1) { // Перевірка на порожнечу черги
            front = 0;
            rear = -1;
        }
        return value;
    }

    public int get(int value) {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        for (int i = 0; i <= rear; i++) {
            if (data[i] == value) {
                return i;
            }
        }
        return -1;
    }

    // Перевірка на порожнечу черги
    public boolean isEmpty() {
        return rear == -1 || front == rear + 1;
    }

    // Збільшення розміру черги
    private void resize() {
        int[] newData = new int[data.length * 2];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }

    public String toString() {
        String text = "[";
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        } else {
            for (int i = 0; i < rear; i++) {
                text += data[i] + ", ";
            }
            text += data[rear] + "]";
        }

        return text;
    }

    public boolean equals(Queue src) {
        if (src == null)
            return false;
        if (isEmpty() && src.isEmpty()) {
            return true;
        }
        if (rear != src.rear) {
            return false;
        }
        for (int i = 0; i <= rear; i++) {
            if (get(i) != src.get(i)) {
                return false;
            }
        }
        return true;
    }
}
