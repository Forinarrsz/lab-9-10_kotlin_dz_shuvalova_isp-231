class Employee(
    private var fullName: String,
    private var position: String,
    private var salary: Double,
    private var yearsOfExperience: Int
) {
    var name: String
        get() = fullName
        private set(value) {
            fullName = value
        }

    var jobTitle: String
        get() = position
        private set(value) {
            position = value
        }

    var salaryAmount: Double
        get() = salary
        set(value) {
            if (value < 0) {
                println("Зарплата не может быть отрицательной. Устанавливается 0.")
                salary = 0.0
            } else {
                salary = value
            }
        }

    var experience: Int
        get() = yearsOfExperience
        set(value) {
            when {
                value < 0 -> {
                    println("Опыт работы не может быть отрицательным. Устанавливается 0.")
                    yearsOfExperience = 0
                }
                value > 50 -> {
                    println("Максимальный опыт работы - 50 лет. Устанавливается 50.")
                    yearsOfExperience = 50
                }
                else -> {
                    yearsOfExperience = value
                }
            }
        }
}
fun main() {
    val employee = Employee("Иванов Иван Иванович", "Разработчик", 50000.0, 5)
   println("ФИО: ${employee.name}, Должность: ${employee.jobTitle}, Зарплата: ${employee.salaryAmount}, Опыт работы: ${employee.experience}")
    employee.salaryAmount = -1000.0
    employee.experience = 60
    println("ФИО: ${employee.name}, Должность: ${employee.jobTitle}, Зарплата: ${employee.salaryAmount}, Опыт работы: ${employee.experience}")
}
