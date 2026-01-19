abstract class Department {
    abstract val departmentName: String
    abstract fun printDepartmentGoal()
}
/*class DevelopmentDepartment : Department() {
    override val departmentName: String = "Отдел разработки"

    override fun printDepartmentGoal() {
        println("Цель отдела: Писать чистый код")
    }
}*/
//задание 5
class DevelopmentDepartment : Department(), ReportGenerator {
    override val departmentName: String = "Отдел разработки"

    override fun printDepartmentGoal() {
        println("Цель отдела: Писать чистый код")
    }

    override fun generateReport(): String {
        return "Отдел: $departmentName, Цель: Писать чистый код"
    }
}

class TestingDepartment : Department() {
    override val departmentName: String = "Отдел тестирования"

    override fun printDepartmentGoal() {
        println("Цель отдела: Находить все баги")
    }
}
fun main() {/*
    val developmentDepartment = DevelopmentDepartment()
    val testingDepartment = TestingDepartment()

    println("${developmentDepartment.departmentName}:")
    developmentDepartment.printDepartmentGoal()

    println("${testingDepartment.departmentName}:")
    testingDepartment.printDepartmentGoal()
*/
//задание 5
    val employee = Employee("Иванов Иван Иванович", "Разработчик")
    val developmentDepartment = DevelopmentDepartment()

    val reportGenerators: List<ReportGenerator> = listOf(employee, developmentDepartment)

    for (reportGenerator in reportGenerators) {
        println(reportGenerator.generateReport())
    }}
