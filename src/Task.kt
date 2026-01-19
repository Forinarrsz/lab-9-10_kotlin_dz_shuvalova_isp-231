enum class Priority {
    LOW, MEDIUM, HIGH
}

data class Task(
    val title: String,
    val description: String,
    val priority: Priority,
    val isCompleted: Boolean = false
)
fun main() {
    val task1 = Task("Сделать дз по kotlin", "дедлайн: среда", Priority.LOW)
    val task2 = Task("сделать дз по C#", "дедлайн: пятница", Priority.MEDIUM)
    val task3 = Task("Сделать дз по kotlin", "дедлайн: среда", Priority.HIGH)

    println("Tasks:")
    println(task1)
    println(task2)
    println(task3)

    println("Сравнение задач:")
    println("task1 == task3: ${task1 == task3}")
    println("task1 == task1.copy(priority = Priority.LOW): ${task1 == task1.copy(priority = Priority.LOW)}")

    val copiedTask = task1.copy(priority = Priority.HIGH)
    println("Скопированная задача:")
    println(copiedTask)

    println("HashCode:")
    println("task1 hashCode: ${task1.hashCode()}")
    println("copiedTask hashCode: ${copiedTask.hashCode()}")
}
