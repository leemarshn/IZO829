package collections;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by Lee N on 03, Wed,Jan,2024.
 */
public class TaskPriorityQueue {
        private final String name;
        private final int priority;

    public TaskPriorityQueue(String name, int priority) {
            this.name = name;
            this.priority = priority;
        }
        public String getName() {
            return name;
        }
        public int getPriority() {
            return priority;
        }
        @Override
        public String toString() {
            return name + " (Priority: " + priority + ")";
        }
    public static void main(String[] args) {
        Comparator<TaskPriorityQueue> priorityComparator = Comparator.comparingInt(TaskPriorityQueue::getPriority).reversed();

        PriorityQueue<TaskPriorityQueue> taskQueue = new PriorityQueue<>(priorityComparator);

        taskQueue.add(new TaskPriorityQueue("Task A", 3));
        taskQueue.add(new TaskPriorityQueue("Task B", 1));
        taskQueue.add(new TaskPriorityQueue("Task C", 2));
        taskQueue.add(new TaskPriorityQueue("Task D", 4));


        while (!taskQueue.isEmpty()) {
            TaskPriorityQueue task = taskQueue.poll();  // Retrieves and removes the highest priority task
            System.out.println("Processing task: " + task);
        }
    }
}
