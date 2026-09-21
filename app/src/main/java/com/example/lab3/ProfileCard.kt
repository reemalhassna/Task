package com.example.lab3

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

data class Student(
    val name: String,
    val program: String,
    val gpa: String,
    val email: String,
    val city: String
)

@Composable
fun StudentCard(
    student: Student,
    modifier: Modifier = Modifier
) {
    // TODO: Task 2 fills this in
    Card(
        modifier = modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier.weight(1f)
                ) {
                    Text(text = student.name, style = MaterialTheme.typography.titleMedium)
                    Text(text = student.program, style = MaterialTheme.typography.bodySmall)
                }
                Text(text = student.gpa, style = MaterialTheme.typography.titleMedium)
            }

            HorizontalDivider()

            Text(text = student.email, style = MaterialTheme.typography.bodyMedium)
            Text(text = student.city, style = MaterialTheme.typography.bodyMedium)
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun StudentCardPreview() {
    val sampleStudent = Student(
        name = "Ahmed Al-Qahtani",
        program = "Computer Science • Level 4",
        gpa = "4.62",
        email = "2200001234@iau.edu.sa",
        city = "Jubail, Eastern Province"
    )

    StudentCard(student = sampleStudent)
}
