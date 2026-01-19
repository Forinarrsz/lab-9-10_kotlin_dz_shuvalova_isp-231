enum class Priority {
    LOW, MEDIUM, HIGH
}

data class Task(
    val title: String,
    val description: String,
    val priority: Priority,
    val isCompleted: Boolean = false
)