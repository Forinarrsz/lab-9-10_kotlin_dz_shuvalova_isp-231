abstract class Department {
    abstract val departmentName: String
    abstract fun printDepartmentGoal()
}
class DevelopmentDepartment : Department() {
    override val departmentName: String = "Отдел разработки"

    override fun printDepartmentGoal() {
        println("Цель отдела: Писать чистый код")
    }
}
class TestingDepartment : Department() {
    override val departmentName: String = "Отдел тестирования"

    override fun printDepartmentGoal() {
        println("Цель отдела: Находить все баги")
    }
}
fun main() {
    val developmentDepartment = DevelopmentDepartment()
    val testingDepartment = TestingDepartment()

    println("${developmentDepartment.departmentName}:")
    developmentDepartment.printDepartmentGoal()

    println("${testingDepartment.departmentName}:")
    testingDepartment.printDepartmentGoal()
}
